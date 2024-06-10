#include<stdio.h>
#include<stdlib.h>
#include<string.h>
 
struct node{
  int key;
  struct node *next;
  struct node *prev;
};
 
typedef struct node *NodePointer;
NodePointer N;

void init(){
  N = malloc(sizeof(struct node));
  N->next = N;
  N->prev = N;
}

void printList(){
  NodePointer cur = N->next;
  int snl = 1;
  while(cur != N){
    if ( snl == 0)  printf(" ");
    printf("%d", cur->key);
    cur = cur->next;
    snl = 0;
  }
  printf("\n");
}

void deleteFirst(){
  NodePointer t = N->next;
  N->next = t->next;
  t->next->prev = N;
}
 
void deleteLast(){
 
  NodePointer delnode = N->prev;
 
  N->prev = delnode->prev;
  delnode->prev->next = N;
  free(delnode);
}
 
void delete(int skey){
  int judge = 0;
  NodePointer t;
  NodePointer n; 

  for(n = N->next;n != N;n = n->next){
    if(n->key == skey){
      judge = 1;
    }
  }

  if(judge == 1){
    n = N->next;
    while(n != N){
      if(n->key == skey)
	break;
      n=n->next;
    }
    t = n->prev;
    t->next = n->next;
    t->next->prev = t;
    free(n);
  }
}

void insert(int skey){
  NodePointer new;
  static int count = 0;
  new = malloc(sizeof(struct node));
  new->key = skey;
 
  if(count == 0){
  new->next = N;
  N->next = new;
  new->prev = N;
  N->prev = new;
  count++;
  }
 
  else{
    new->next = N->next;
    N->next->prev = new;
    N->next = new;
    new->prev = N;
    count++;
  }
}

int main(){
  int key, n, i;
  char com[12];
   
  scanf("%d", &n);
  init();
  for ( i = 0; i < n; i++ ){
    scanf("%s",com);
    if(strcmp(com,"insert") == 0){
      scanf("%d",&key);
      insert(key);
    }
    else if(strcmp(com,"deleteFirst") == 0)
      deleteFirst();
    else if(strcmp(com,"deleteLast") == 0)
      deleteLast();
    else{
      scanf("%d",&key);
      delete(key);
    }
  }
  printList();
  return 0;
}
