#include<stdio.h>
#include<stdlib.h>
#include<stdint.h>
#include<inttypes.h>

typedef struct binaryHeap{
  void *array;
  size_t heap_size;
  size_t max_size;
  size_t val_size;
  int (*cmp) (const void *, const void *);
} heap;

heap* new_binary_heap (const size_t val_size, int (*cmpF) (const void *, const void *)) {
  heap *h = (heap *) calloc (1, sizeof (heap));
  h->array = malloc (val_size * (1 + 1));
  h->heap_size = 0;
  h->max_size = 1;
  h->val_size = val_size;
  h->cmp = cmpF;
  return h;
}

int32_t get_heap_size (const heap *h) {
  return h->heap_size;
}

int is_empty (const heap *h) {
  return h->heap_size == 0;
}

void free_heap (heap *h) {
  free (h->array);
  free (h);
}

void init_heap (heap *h) {
  h->heap_size = 0;
}

static void heap_func_swap (void * restrict a, void * restrict b, size_t val_size) {
  if ((val_size & 7) == 0) {
    uint64_t *p = (uint64_t *) a;
    uint64_t *q = (uint64_t *) b;
    val_size /= sizeof (uint64_t);
    while (val_size--) {
      uint64_t tmp = *p;
      *p++ = *q;
      *q++ = tmp;
    }
  } else {
    uint8_t *p = (uint8_t *) a;
    uint8_t *q = (uint8_t *) b;
    while (val_size--) {
      uint8_t tmp = *p;
      *p++ = *q;
      *q++ = tmp;
    }
  }
}

static void heap_func_copy (void * restrict dst, const void * restrict src, size_t val_size) {
  if ((val_size & 7) == 0) {
    uint64_t *p = (uint64_t *) src;
    uint64_t *q = (uint64_t *) dst;
    val_size /= sizeof (uint64_t);
    while (val_size--) {
      *q++ = *p++;
    }
  } else {
    uint8_t *p = (uint8_t *) src;
    uint8_t *q = (uint8_t *) dst;
    while (val_size--) {
      *q++ = *p++;
    }
  }
}

void push (heap *h, const void *val) {
  if (h->heap_size == h->max_size) {
    h->max_size = 2 * h->max_size + 1;
    h->array = realloc (h->array, h->val_size * (h->max_size + 1));
  }
  h->heap_size++;
  uint8_t *array = (uint8_t *) h->array;
  size_t k = h->heap_size;
  const size_t val_size = h->val_size;
  int (*cmp) (const void *, const void *) = h->cmp;
  heap_func_copy(array + k * val_size, val, val_size);
  while(k>1){
    size_t parent = k / 2;
    if (cmp (array + parent * val_size, array + k * val_size) <= 0) {
      return;
    }
    heap_func_swap (array + parent * val_size, array + k * val_size, val_size);
    k = parent;
  }
}

void pop (heap *h, void *res) {
  uint8_t *array = (uint8_t *) h->array;
  const size_t val_size = h->val_size;
  if (res != NULL) {
    heap_func_copy (res, array + val_size, val_size);
  }
  heap_func_copy (array + val_size, array + val_size * h->heap_size, val_size);
  h->heap_size--;
  int (* const cmp) (const void *, const void *) = h->cmp;
  const size_t n = h->heap_size;
  size_t k = 1;
  while (2 * k  + 1 <= n) {
    int c = cmp (array + val_size * 2 * k, array + val_size * (2 * k + 1));
    size_t next = 2 * k + (c <= 0 ? 0 : 1);
    if (cmp (array + val_size * k, array + val_size * next) <= 0) return;
    heap_func_swap (array + val_size * k, array + val_size * next, val_size);
    k = next;
  }
  if (2 * k <= n && cmp (array + val_size * k, array + val_size * 2 * k) > 0) {
    heap_func_swap (array + val_size * k, array + val_size * 2 * k, val_size);
  }
}

void top (const heap *h, void *res) {
  uint8_t *array = (uint8_t *) h->array;
  const size_t val_size = h->val_size;
  if (res != NULL) {
    heap_func_copy (res, array + val_size, val_size);
  }
}

typedef struct UnionFind {
  int32_t *parent;
  int32_t size;
} UnionFind;

void initUnionFind (UnionFind *u) {
  for (int32_t i = 0; i < u->size; ++i){
    u->parent[i] = -1;
  }
}

UnionFind* newUnionFind (const int32_t size) {
  UnionFind *u = (UnionFind *) calloc (1, sizeof (UnionFind));
  u->parent = (int32_t *) calloc (size, sizeof (int32_t));
  u->size = size;
  initUnionFind (u);
  return u;
}

void freeUnionFind (UnionFind *u) {
  free (u->parent);
  free (u);
}

int32_t root (UnionFind *u, int32_t x) {
  int32_t index[32];
  int32_t len = 0;
  while (u->parent[x] >= 0) {
    index[len++] = x;
    x = u->parent[x];
  }
  while (len > 0) {
    u->parent[index[--len]] = x;
  }
  return x;
}

int same (UnionFind *u, int32_t x, int32_t y) {
  return root (u, x) == root (u, y);
}

int32_t getSize(UnionFind *u, int32_t x) {
  return - (u->parent[root (u, x)]);
}

void unite(UnionFind *u, int32_t x, int32_t y) {
  x = root (u, x);
  y = root (u, y);
  if (x == y) return;
  if (u->parent[x] > u->parent[y]) {
    int32_t swap = x;
    x = y;
    y = swap;
  }
  u->parent[x] += u->parent[y];
  u->parent[y] = x;
}

typedef struct segment_tree_void {
  void *array;
  int32_t size;
  size_t val_size;
  void (*func) (void *, const void *, const void *);
} segment_tree;

static inline void segment_tree_memcpy (void *dst, const void *src, size_t size) {
  uint8_t *p = dst;
  const uint8_t *q = src;
  while (size--) {
    *p++ = *q++;
  }
}

segment_tree* new_segment_tree (const void *ini, const int32_t n, const size_t val_size, void (*func) (void *, const void *, const void *)) {
  int32_t k = 1;
  while (k < n) k *= 2;
  segment_tree *s = (segment_tree *) calloc (1, sizeof (segment_tree));
  s->array = calloc (2 * k, val_size);
  s->size = k;
  s->val_size = val_size;
  s->func = func;
  for (int32_t i = k; i < 2 * k; ++i) {
    segment_tree_memcpy ((uint8_t *)s->array + i * val_size, ini, val_size);
  }
  uint8_t *a = s->array;
  for (int32_t i = k - 1; i > 0; --i) {
    func (a + i * val_size, a + (2 * i) * val_size, a + (2 * i + 1) * val_size);
  }
  return s;
}

void update (segment_tree * const s, int32_t k, const void *val) {
  k += s->size;
  uint8_t *p = s->array;
  const size_t size = s->val_size;
  segment_tree_memcpy (p + k * size, val, size);
  for (k >>= 1; k > 0; k >>= 1) {
    s->func (p + k * size, p + 2 * k * size, p + (2 * k + 1) * size);
  }
}

void update_tmp (segment_tree * const s, int32_t k, const void *val) {
  k += s->size;
  uint8_t *p = s->array;
  const size_t size = s->val_size;
  segment_tree_memcpy (p + k * size, val, size);
}

void update_all (segment_tree * const s) {
  uint8_t * const a = s->array;
  const size_t size = s->val_size;
  for (int32_t i = s->size - 1; i > 0; --i) {
    s->func (a + i * size, a + (2 * i) * size, a + (2 * i + 1) * size);
  }
}

void find (const segment_tree *s, int32_t l, int32_t r, void *res) {
  int32_t lindex[32];
  int32_t rindex[32];
  int32_t llen = 0;
  int32_t rlen = 0;
  for (l += s->size, r += s->size; l < r; l >>= 1, r >>= 1) {
    if (l & 1) lindex[llen++] = l++;
    if (r & 1) rindex[rlen++] = --r;
  }
  const uint8_t *p = s->array;
  if (llen == 0) {
    lindex[llen++] = rindex[--rlen];
  }
  segment_tree_memcpy (res, p + lindex[0] * s->val_size, s->val_size);
  for (int32_t i = 1; i < llen; ++i) {
    s->func (res, res, p + lindex[i] * s->val_size);
  }
  for (int32_t i = rlen - 1; i >= 0; --i) {
    s->func (res, res, p + rindex[i] * s->val_size);
  }
}

typedef int32_t i32;
typedef int64_t i64;

typedef struct index_val {
  i32 index;
  i32 val;
} index_val;

int cmp_index_val (const void *a, const void *b) {
  i32 d = ((index_val *)a)->val - ((index_val *)b)->val;
  return d == 0 ? 0 : d > 0 ? -1 : 1;
}

typedef struct segment_node {
  i32 index;
  i64 val;
} segment_node;

void func_segment_node (void *c, const void *a, const void *b) {
  const segment_node *p = (const segment_node *)a;
  const segment_node *q = (const segment_node *)b;
  *(segment_node *)c = p->val < q->val ? *p : *q;
}

typedef struct edge {
  i32 a, b;
  i64 c;
} edge;

int cmp_edge (const void *a, const void *b) {
  i64 d = ((edge *)a)->c - ((edge *)b)->c;
  return d == 0 ? 0 : d < 0 ? -1 : 1;
}

void run (void) {
  i32 n, d;
  scanf ("%" SCNi32 "%" SCNi32, &n, &d);
  i32 *a = (i32 *) calloc (n, sizeof (i32));
  index_val *p = (index_val *) calloc (n, sizeof (index_val));
  for (i32 i = 0; i < n; ++i) {
    scanf ("%" SCNi32, a + i);
    p[i] = (index_val){i, a[i]};
  }
  qsort (p, n, sizeof (index_val), cmp_index_val);
  const segment_node ini = {n, (i64)(n + 2) * 1000000000 + 1};
  segment_tree *l = new_segment_tree (&ini, n, sizeof (segment_node), func_segment_node);
  segment_tree *r = new_segment_tree (&ini, n, sizeof (segment_node), func_segment_node);
  for (i32 i = 0; i < n; ++i) {
    update_tmp (l, i, &((segment_node){i, a[i] + (i64)(n - 1 - i) * d}));
    update_tmp (r, i, &((segment_node){i, a[i] + (i64)i * d}));
  }
  update_all (l);
  update_all (r);
  heap *h = new_binary_heap (sizeof (edge), cmp_edge);
  for (i32 i = 0; i < n; ++i) {
    i32 v = p[i].index;
    if (v > 0) {
      segment_node t;
      find (l, 0, v, &t);
      push (h, &((edge){v, t.index, p[i].val + t.val - (i64) (n - 1 - v) * d}));
    }
    if (v + 1 < n) {
      segment_node t;
      find (r, v + 1, n, &t);
      push (h, &((edge){v, t.index, p[i].val + t.val - (i64) v * d}));
    }
    update (l, v, &ini);
    update (r, v, &ini);
  }
  i64 sum = 0;
  UnionFind *u = newUnionFind (n);
  while (getSize (u, 0) < n) {
    edge e;
    pop (h, &e);
    if (same (u, e.a, e.b)) continue;
    unite (u, e.a, e.b);
    sum += e.c;
  }
  printf ("%" PRIi64 "\n", sum);
}

int main (void) {
  run ();
  return 0;
}
