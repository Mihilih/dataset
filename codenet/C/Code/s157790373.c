#include<stdio.h>
#define LEN 300
#define TRUE 1
#define FALSE -1

int solve(int, int);
int n, A[LEN];
int flag;

int main()
{
  int q, M;
  int i, j, k;

  scanf("%d", &n);
  for(i=0; i<n; i++)scanf("%d", &A[i]);

  scanf("%d", &q);
  for(i=0; i<q; i++)
    {
      scanf("%d", &M);
      flag=FALSE;

      solve(-1, M);
      if(flag==TRUE)printf("yes\n");
      else printf("no\n");
    }


  return 0;
}

int solve(int i, int m)
{
  if(i>n)return FALSE;
  else if(m<0)return FALSE;
  else if(m==0 || m-A[i+1]==0)
    {
      flag=TRUE;
      return TRUE;
    }
  else
    {
      //not use A[i]
      solve(i+1, m);
      //use A[i]
      solve(i+1, m-A[i]);
    }
}