#include <stdio.h>

int main()
{
 int a[1000],n,i,j,d=0;
 scanf("%d",&n);
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 for (i = 0;i<n;i++)
 {   
     for (j = n-1;j>= i+1;j--)
     {
        if (a[j] < a[j-1])
        {
          int temp=a[j];
          a[j]=a[j-1];
          a[j-1]=temp;
          d++;
        }
     }
 }
  printf("%d",a[0]);
  for(i=1;i<n;i++)
  {
   printf(" %d",a[i]);
  }
 printf("\n%d\n",d);
 return 0;
}