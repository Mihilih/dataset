#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int low[200000];
int high[200000];
int a[200000];

int part(int a[],int b[],int l,int r){
  int i,j,x,t;

  i = l - 1;
  j = r;

  x = b[r];

  while(1){
    while(b[++i] < x);
    while(i < --j && x < b[j]);

    if(i >= j) break;

    t = a[i]; a[i] = a[j]; a[j] = t;
    t = b[i]; b[i] = b[j]; b[j] = t;
  }

  t = a[i]; a[i] = a[r]; a[r] = t;
  t = b[i]; b[i] = b[r]; b[r] = t;
  return i;
}

void quicksort(int a[],int b[],int n){
  int l,r,v;
  int sp;

  low[0] = 0;
  high[0] = n - 1;
  sp = 1;

  while(sp > 0){
    sp--;
    l = low[sp];
    r = high[sp];

    if(l >= r);

    else {
      v = part(a,b,l,r);

      if(v - l < r - v){
        low[sp] = v + 1;
        high[sp++] = r;
        low[sp] = l;
        high[sp++] = v - 1;
      }

      else{
        low[sp] = l;
        high[sp++] = v - 1;
        low[sp] = v + 1;
        high[sp++] = r;
      }
    }
  }
}

int main(){
  int n,m;
  int i;
  int a[100006];
  int b[100006];
  int cnt = 0;
  int t;

  scanf("%d %d", &n, &m);

  for(i = 0;i < m;i++) scanf("%d %d", &a[i], &b[i]);

  quicksort(a,b,m);

  t = 0;
  for(i = 0;i < m;i++){
    if(t <= a[i]){
      t = b[i];
      cnt++;
    }
  }

  printf("%d\n", cnt);

  return 0;
}
