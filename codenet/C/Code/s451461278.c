#include <stdio.h>
#include <stdlib.h>
#define MAX 100000

int Partition(char [], int [], int, int);
void Quicksort(char [], int [], int, int);


void Merge(char [], int [],int,int,int);
void Merge_Sort(char [], int [],int,int);


int q;

int main(void){

  int A[MAX + 1];
  char C[MAX + 1];
  char MC[MAX + 1];
  int MN[MAX + 1];

  int i, p, n;
  int count = 0;

  scanf("%d",&n);

  for(i=1;i<=n;i++)
    scanf(" %c %d",&C[i], &A[i]);

  for(i=1;i<=n;i++){
    MC[i] = C[i];
    MN[i] = A[i];
  }


  Merge_Sort(MC,MN,1,n);

  p = 1;
  Quicksort(C, A, p, n);

  for(i = 1; i <= n;i++){
    if(MN[i] == A[i] && MC[i] == C[i])
      count++;
  }

  if(count == n)
    printf("Stable\n");

  else
    printf("Not stable\n");


  for(i=1;i<=n;i++)
    printf("%c %d\n",C[i], A[i]);

  return 0;
}

int Partition(char C[], int A[], int p, int r){

  int i, j;
  char tmpC,x;
  int  tmpN, y;

  x = C[r];
  y = A[r];
  i = p - 1;

  for(j = p;j<r;j++){
    if(A[j] <= y){
      i = i + 1;
      tmpN = A[j];
      tmpC = C[j];
      A[j] = A[i];
      C[j] = C[i];
      A[i] = tmpN;
      C[i] = tmpC;
    }
  }
  
  tmpN = A[i+1];
  tmpC = C[i + 1];
  A[i+1] = A[r];
  C[i+1] = C[r];
  A[r] = tmpN;
  C[r] = tmpC;

  return i+1;
}

void Quicksort(char C[], int A[], int p, int r){


  if(p < r){
    q = Partition(C, A, p, r);
    Quicksort(C, A, p, q-1);
    Quicksort(C, A, q+1, r);
    }
}


//Merge_Sortから送られてきたデータを結合する。
void Merge(char MC[], int MN[],int left,int mid,int right){

    int n1 = mid - left + 1;
    int n2 = right - mid;
    int LN[n1 + 1];
    int RN[n2 + 1];
    int LC[n1 + 1];
    int RC[n2 + 1];
    
    int i,j,k;
    
    for(i = 1;i <= n1;i++){
      LN[i] = MN[left + i - 1];
      LC[i] = MC[left + i - 1];
    }
    
    for(i = 1;i <= n2;i++){
      RN[i] = MN[mid + i];
      RC[i] = MC[mid + i];
    }
    
    LN[n1+1] = 1000000000;
    RN[n2+1] = 1000000000;
    
    i = 1;
    j = 1;
    
    for(k = left;k <= right;k++){
      if(LN[i] <= RN[j]){
	MN[k] = LN[i];
	MC[k] = LC[i++];
      }
      else{
	MN[k] = RN[j];
	MC[k] = RC[j++];
      }
    }
}


//ここで分割できるだけ分割する
void Merge_Sort(char MC[], int MN[],int left,int right){
    int mid;

    // 2つになるまで分割して行く
    if(left < right){
        mid = (left + right)/2;
        Merge_Sort(MC,MN,left,mid);
        Merge_Sort(MC,MN,mid+1,right);
        Merge(MC,MN,left,mid,right);
    }
}