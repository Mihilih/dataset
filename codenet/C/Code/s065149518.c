#include <stdio.h>
#include <string.h>
#define MAX 21

void init(int);
void move(int);

int n, x, y;
char fld[MAX][MAX];

int main(void) {
    int m;
    while(~scanf("%d", &n), n) {
        init(n);
        scanf("%d", &m);
        move(m);
        printf("%s\n", n ? "No" : "Yes");
    }
    return 0;
}

void init(int i) {
    int a, b;
    x = y = 10;
    memset(fld, 0, sizeof(fld));
    while(i--) {
        scanf("%d %d", &a, &b);
        fld[b][a] = 1;
    }
}

void move(int i) {
    int a, d;
    char buf[2];
    while(i--) {
        scanf("%1s %d", buf, &a);
        switch(buf[0]) {
          case 'N':
            d = 0;
            break;
          case 'E':
            d = 1;
            break;
          case 'S':
            d = 2;
            break;
          case 'W':
            d = 3;
            break;
        }
        while(a--) {
            d % 2 ? ~-d ? x-- : x++ : d ? y-- : y++;
            if(fld[y][x]) {
                fld[y][x] = 0;
                n--;
            }
        }
    }
}