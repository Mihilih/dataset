# include<stdio.h>
# include<stdlib.h>

typedef struct{
  int parent;
  int right;
  int left;
}BT;

BT bt[26];
int n;

void Preorder(int a){
  if(a == -1) return;

  printf(" %d",a);
  Preorder(bt[a].left);
  Preorder(bt[a].right);

}

void Inorder(int a){
  if(a==-1)return;

  Inorder(bt[a].left);
  printf(" %d",a);
  Inorder(bt[a].right);
}

void Postorder(int a){
  if(a==-1)return;

  Postorder(bt[a].left);
  Postorder(bt[a].right);
  printf(" %d",a);
}

int main(){
  int i,j,num,depth = 0;
 

  
  scanf("%d",&n);

  for(i=0;i<n;++i) bt[i].parent = -1;

  for(i=0;i<n;i++){
    scanf("%d",&num);
    scanf("%d%d",&(bt[num].left),&(bt[num].right));

    if(bt[num].left != -1 &&bt[num].right != -1){
      bt[bt[num].left].parent = num;
      bt[bt[num].right].parent = num;
      
    }
    else if(bt[num].left != -1) bt[bt[num].left].parent = num;
    else if(bt[num].right != -1) bt[bt[num].right].parent = num;
  }

  for(i=0;bt[i].parent != -1;++i);
  
  printf("Preorder\n");
  Preorder(i);
  printf("\n");

  printf("Inorder\n");
  Inorder(i);
  printf("\n");

  printf("Postorder\n");
  Postorder(i);
  printf("\n");

  return 0;
}

