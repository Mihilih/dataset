#include <stdio.h>
  
#define PutChar(c) ; *p = (char)(c); ++p;
  
#define MAX_N (2000001)
#define MAX_Ai (10001)
#define STR_SIZE (10000010)
  
int getNum(void);
void putNum(int n);
void CountingSort(int A[], int B[], int k, int len);
  
int A[MAX_N];
int B[MAX_N];
char str[STR_SIZE];
char *p = str;
  
int main(void) {
    register int i;
    int n;
  
    fread(str, 1, STR_SIZE, stdin);
      
    n = getNum();
    for (i = 1; i <= n; ++i) {
        A[i] = getNum();
    }
      
    CountingSort(A, B, MAX_Ai, n);
      
    p = str;
    --n;
    for (i = 1; i <= n; ++i) {
        putNum(B[i]);
        PutChar(' ');
    }
    putNum(B[i]);
    PutChar('\0');
      
    puts(str);
      
    return 0;
}
  
int getNum(void) {
    int n = 0;
    while ((*p >= '0') && (*p <= '9')) {
        n = n * 10 + (int)(*p - '0');
        ++p;
    }
    ++p;
    return n;
}
  
void putNum(int n) {
    int d;
    if (n < 10) {
        PutChar('0' + n);
        return;
    }
    d = n / 10;
    if (d) putNum(d);
    PutChar('0' + (n - (d * 10)));
}
  
void CountingSort(int A[], int B[], int k, int len) {
    int C[MAX_Ai] = { 0 };
    int i, j;
    for (j = 1; j <= len; ++j) {
        ++C[A[j]];
    }
    for (i = 1; i <= k; ++i) {
        C[i] += C[i - 1];
    }
    for (j = len; j > 0; --j) {
        B[C[A[j]]] = A[j];
        --C[A[j]];
    }
}