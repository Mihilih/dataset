#include<stdio.h>

void white(int n,int A[]){
	int i;
	for(i=0;i<n-1;i++){
		printf("%d ",A[i]);
	}
	printf("%d\n",A[i]);
}

void insertionsort(int n,int A[]){
	int i,j,a;
	for(i=0;i<n;i++){
		for(j=0;j<i;j++){
			if(A[i]<A[j])
			{
				a=A[i];A[i]=A[j];A[j]=a;
			}
		}
	white(n,A);
	}
}

int main(){
	int i,n,A[100];
	scanf("%d",&n);
	for (i = 0; i < n; i++) {
		scanf("%d", &A[i]);
	}
	insertionsort(n,A);

	return 0;
}