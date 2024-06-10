#include <stdio.h>

#define MAX 25

typedef struct{
  int l,r,par;
} node;

node N[MAX];

void init(int);
void Preorder(int);
void Inorder(int);
void Postorder(int);

int main(){
  int n,i,id,l,r;
  int p;

  scanf("%d" ,&n);
  init(n);

  for(i = 0 ; i < n ; i++){
    scanf("%d%d%d" ,&id ,&l ,&r);

    if(l != -1){
      N[id].l = l;
      N[l].par = id;
    }
    if(r != -1){
      N[id].r = r;
      N[r].par = id;
    }
  }

  for(i = 0 ; i < n ; i++){
    if(N[i].par == -1){
      p = i;
      break;}
}

puts("Preorder");
Preorder(p);
puts("");

puts("Inorder");
Inorder(p);
puts("");

puts("Postorder");
Postorder(p);
puts("");

return 0;
}

void init(int n){
  int i;

  for(i = 0 ; i < n ; i++){
    N[i].par = N[i].l = N[i].r = -1;
  }
}

void Preorder(int p){
  if(p != -1){
    printf(" %d" ,p);
    Preorder(N[p].l);
    Preorder(N[p].r);
  }
}

void Inorder(int p){
  if(p != -1){
    Inorder(N[p].l);
    printf(" %d" ,p);
    Inorder(N[p].r);
  }
}

void Postorder(int p){
  if(p != -1){
    Postorder(N[p].l);
    Postorder(N[p].r);
    printf(" %d" ,p);
  }
}
