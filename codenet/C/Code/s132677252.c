#include<stdio.h>
#include<stdlib.h>
#include<stdint.h>
#include<inttypes.h>

typedef int32_t i32;
typedef int64_t i64;

typedef struct directed_edge {
  int32_t vertex;
  int32_t next;
} graph_edge;

typedef struct directedGraph {
  graph_edge *edge;
  int32_t *start;
  int32_t pointer;
  int32_t vertex_num;
  int32_t edge_max_size;
} graph;

graph* new_graph (const int vertex_num) {
  graph *g = (graph *) calloc (1, sizeof (graph));
  g->edge = (graph_edge *) calloc (1, sizeof (graph_edge));
  g->start = (int32_t *) calloc (vertex_num, sizeof (int32_t));
  g->pointer = 0;
  g->vertex_num = vertex_num;
  g->edge_max_size = 1;
  for (int32_t i = 0; i < vertex_num; ++i) {
    g->start[i] = -1;
  }
  return g;
}

void add_edge (graph *g, int32_t from, int32_t to) {
  if (g->pointer == g->edge_max_size) {
    g->edge_max_size *= 2;
    g->edge = (graph_edge *) realloc (g->edge, sizeof (graph_edge) * g->edge_max_size);
  }
  g->edge[g->pointer] = (graph_edge) {to, g->start[from]};
  g->start[from] = g->pointer++;
}

const i32 mod = 1000000007;

i32 mod_pow (i32 r, i32 n) {
  i32 t = 1;
  i32 s = r;
  while (n > 0) {
    if (n & 1) t = (i64) t * s % mod;
    s = (i64) s * s % mod;
    n >>= 1;
  }
  return t;
}

typedef struct dp_node {
  i32 one;
  i32 zero;
} node;

node merge (node *a, i32 n) {
  i64 one = 0;
  i64 zero = 1;
  i64 total = 1;
  for (i32 i = 0; i < n; ++i) {
    one = (one * a[i].zero + zero * a[i].one) % mod;
    zero = zero * a[i].zero % mod;
    total = total * (a[i].zero + a[i].one) % mod;
  }
  return (node) {one, (total + mod - one) % mod};
}

typedef node deque_val;

typedef struct Deque {
  deque_val *array;
  size_t front;
  size_t last;
  size_t mask;
} deque;

deque* new_deque (void) {
  const size_t len = 2;
  deque *d = (deque *) calloc (len, sizeof (deque));
  d->array = (deque_val *) calloc (len, sizeof (deque_val));
  d->front = d->last = 0;
  d->mask = len - 1;
  return d;
}

void free_deque (deque * const d) {
  free (d->array);
  free (d);
}

size_t get_size (const deque *d) {
  return (d->last + (~d->front + 1)) & d->mask;
}

void deque_realloc (deque * const d) {
  deque_val *array = (deque_val *) calloc (2 * (d->mask + 1), sizeof (deque_val));
  size_t k = 0;
  for (size_t i = d->front; i != d->last; i = (i + 1) & d->mask) {
    array[k++] = d->array[i];
  }
  free (d->array);
  d->array = array;
  d->front = 0;
  d->last = k;
  d->mask = 2 * d->mask + 1;
}

deque_val get_at (const deque *d, size_t x) {
  return d->array[(d->front + x) & d->mask];
}

void assign_at (const deque *d, size_t x, deque_val v) {
  d->array[(d->front + x) & d->mask] = v;
}

void push_front (deque * const d, const deque_val v) {
  if(((d->last + 1) & d->mask) == d->front) {
    deque_realloc (d);
  }
  d->front = (d->front + d->mask) & d->mask;
  d->array[d->front] = v;
}

int cmp_deque_size (const void *a, const void *b) {
  deque *p = *(deque **)a;
  deque *q = *(deque **)b;
  i32 d = get_size (p) - get_size (q);
  return d == 0 ? 0 : d > 0 ? -1 : 1;
}

void run (void) {
  i32 n;
  scanf ("%" SCNi32, &n);
  i32 *p = (i32 *) calloc (n + 1, sizeof (i32));
  i32 *depth = (i32 *) calloc (n + 1, sizeof (i32));
  i32 *cnt = (i32 *) calloc (n + 1, sizeof (i32));
  cnt[0] = 1;
  graph *g = new_graph (n + 1);
  for (i32 i = 1; i <= n; ++i) {
    scanf ("%" SCNi32, p + i);
    add_edge (g, p[i], i);
    depth[i] = depth[p[i]] + 1;
    cnt[depth[i]]++;
  }
  deque **dp = (deque **) calloc (n + 1, sizeof (deque *));
  deque **child = (deque **) calloc (n + 1, sizeof (deque *));
  node *lst = (node *) calloc (n + 1, sizeof (node));
  for (i32 i = n; i >= 0; --i) {
    i32 v = i;
    if (g->start[v] == -1) {
      dp[v] = new_deque();
      push_front (dp[v], (node) {1, 1});
      continue;
    }
    i32 len = 0;
    for (i32 p = g->start[v]; p != -1; p = g->edge[p].next) {
      i32 u = g->edge[p].vertex;
      child[len++] = dp[u];
    }
    if (len > 1) {
      qsort (child, len, sizeof (deque *), cmp_deque_size);
      for (i32 d = 0; d < (i32) get_size (child[1]); ++d) {
        i32 j = 0;
        for (; j < len && d < (i32) get_size (child[j]); ++j) {
          lst[j] = get_at (child[j], d);
        }
        assign_at (child[0], d, merge (lst, j));
      }
      for (i32 j = 1; j < len; ++j) {
	free_deque (child[j]);
      }
    }
    dp[v] = child[0];
    push_front (dp[v], (node) {1, 1});
  }
  i64 ans = 0;
  for (i32 i = 0; i < (i32) get_size (dp[0]); ++i) {
    ans += (i64) mod_pow (2, n + 1 - cnt[i]) * get_at (dp[0], i).one % mod;
  }
  printf ("%" PRIi64 "\n", ans % mod);
}

int main (void) {
  run();
  return 0;
}
