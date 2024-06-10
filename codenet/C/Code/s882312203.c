#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[]) {
    char s[26];

    scanf("%s", s);

    for (int j = 0; j < strlen(s); j++) {
        for (int i = 0; i < strlen(s); i++) {
            if ((i != j) && (s[i] == s[j])) {
                puts("no");
                return 0;
            }
        }
    }

    puts("yes");

    return 0;
}