#include <stdio.h>

int main(void)
{
  int i,j,k,L,tmp,d,def,end,aj,max,min;
  
  for(;;){
    int an[20],a1[6],a2[6];
    scanf("%d %d", &an[0], &L);
    if(!L) break;
    
    aj=an[0]; end=0;
    for(k=1;k<21;k++){
      for(i=L-1;i>=0;i--,aj/=10){
	a1[i]=aj%10; a2[i]=aj%10;
      }
      for(i=1;i<L;i++){
	for(j=1;j<L;j++){
	  if(a1[j-1]<a1[j]){
	    tmp=a1[j-1]; a1[j-1]=a1[j]; a1[j]=tmp;
	  }
	  if(a2[j-1]>a2[j]){
	    tmp=a2[j-1]; a2[j-1]=a2[j]; a2[j]=tmp;
	  }
	}
      }
      d=1; max=0; min=0;
      for(i=L-1;i>=0;i--,d*=10){
	max+=(a1[i]%10)*d;
	min+=(a2[i]%10)*d;
      }
      def=max-min;
      for(i=0;i<k;i++){
	if(def==an[i]){
	  printf("%d %d %d\n", i, def, k-i);
	  end=1; break;
	}
      }
      if(end==1) break;
      an[k]=def; aj=def;
    }
  }
    
  return 0;
}
  
