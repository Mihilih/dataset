#include <stdio.h>

int min(int a, int b)
{
	if (a <= b){
		return (a);
	}
	return (b);
}

int Chain(int b[10000], int n)
{
	int i, j;
	int count;
	int color;
	int a[10000];
	
	for (i = 0; i < n; i++){
		a[i] = b[i];
	}
	
	for (i = 0; i < n - 4; i++){
		if (a[i] != 0 && a[i] == a[i + 1] && a[i] == a[i + 2] && a[i] == a[i + 3]){
			#if 0
			printf("-----\n");
			for (j = 0; j < n; j++){
				printf("%d\n", a[j]);
			}
			printf("-----\n");
			#endif
			
			count = 0;
			color = a[i];
			
			for (j = i; a[j] == color; j++){
				a[j] = 0;
				count++;
			}
			
			for (j = 0; i + j + count < 10000; j++){
				a[i + j] = a[i + j + count];
				a[i + j + count] = 0;
			}
			
			#if 0
			printf("-----\n");
			for (j = 0; j < n; j++){
				printf("%d\n", a[j]);
			}
			printf("-----\n");
			getch();
			#endif
			
			i = 0;
		}
		
	}
	
	count = 0;
	while (a[count] != 0){
		count++;
	}
	
	if (count == 4 && a[0] == a[1] && a[0] == a[2] && a[0] == a[3]){
		return (0);
	}
	
	return (count);
}

int main(void)
{
	int n;
	int i, j;
	int a[10000];
	int ans;
	int color;
	
	while (1){
		for (i = 0; i < 10000; i++){
			a[i] = 0;
		}
		
		scanf("%d", &n);
		if (n == 0){
			break;
		}
		ans = n;
		
		for (i = 0; i < n; i++){
			scanf("%d", &a[i]);
		}
		
		for (i = 0; i < n - 4; i++){
			int count[3] = {0, 0, 0};
			for (j = i; j < i + 4; j++){
				if (a[j] - 1 >= 0){
					count[a[j] - 1]++;
				}
			}
			
			color = 0;
			for (j = 0; j < 3; j++){
				if (count[j] >= 3){
					color = j + 1;
					break;
				}
			}
			
			if (color != 0){
				for (j = i; j < i + 4; j++){
					int buf;
					buf = a[j];
					a[j] = color;
					ans = min(ans, Chain(a, n));
					a[j] = buf;
				}
			}
		}
		
		printf("%d\n", ans);
	}
	
	return (0);
}