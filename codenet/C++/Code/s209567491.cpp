#define _CRT_SECURE_NO_WARNINGS
#define _USE_MATH_DEFINES
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <functional>
#include <stack>
#include <queue>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <list>
#include <set>
using namespace std;
typedef long long ll;


int main(int argc, char *args[]) {
	int N,D,X;
	int num_of_chocolate;
	int counter;
	int days;
	int A[101];
	cin >> N >> D >> X;
	for (int i = 0; i < N; i++) {
		cin >> A[i];
	}
	num_of_chocolate = 0;
	for (int i = 0; i < N; i++) {
		days = 0;
		counter = 0;
		for (int j = 0;; j++) {
			days = j * A[i] + 1;
			if (days <= D) {
				counter++;
			}
			else {
				break;
			}
		}
		num_of_chocolate = num_of_chocolate + counter;
	}
	num_of_chocolate = num_of_chocolate + X;

	cout << num_of_chocolate << endl;
	
	
}
