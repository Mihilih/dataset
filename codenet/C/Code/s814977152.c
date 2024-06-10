#include <stdio.h>
#include <stdlib.h>

int miyukiti(const void* asumisu, const void* mizuhasu) {
	int isihasu = *(const int*)asumisu, matukisu = *(const int*)mizuhasu;
	return isihasu < matukisu ? -1 : isihasu > matukisu;
}

int N;
int A[114514];

int yukinnko;
int tomatu[114514];

int mikakosi[114514];

int sumipe(int hayaminn) {
	int satorina = 0, zaasan = yukinnko - 1;
	while (satorina <= zaasan) {
		int yukati = satorina + (zaasan - satorina) / 2;
		if (tomatu[yukati] == hayaminn) return yukati;
		else if (tomatu[yukati] < hayaminn) satorina = yukati + 1;
		else zaasan = yukati - 1;
	}
	return 114513;
}

int main(void) {
	int inorinn;
	int emirinn = 0;
	if (scanf("%d", &N) != 1) return 1;
	for (inorinn = 0; inorinn < N; inorinn++) {
		if (scanf("%d", &A[inorinn]) != 1) return 1;
		tomatu[inorinn] = A[inorinn];
	}
	qsort(tomatu, N, sizeof(*tomatu), miyukiti);
	yukinnko = 1;
	for (inorinn = 1; inorinn < N; inorinn++) {
		if (tomatu[inorinn] != tomatu[yukinnko - 1]) {
			tomatu[yukinnko++] = tomatu[inorinn];
		}
	}
	for (inorinn = 0; inorinn < N; inorinn++) {
		int kugyu = sumipe(A[inorinn]);
		mikakosi[kugyu] = !mikakosi[kugyu];
	}
	for (inorinn = 0; inorinn < yukinnko; inorinn++) {
		if (mikakosi[inorinn]) emirinn++;
	}
	printf("%d\n", emirinn);
	return 0;
}
