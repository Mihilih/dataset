#include <stdio.h>
#include <ctype.h>

int main(){
    int i, alpha[26];
    char ch;

    for(i = 0; i < 26; i++)alpha[i] = 0;

    while(1){
        ch = getchar();
        if(ch == EOF)break;

        if(isalpha(ch)){
            if(isupper(ch))alpha[ch - 65]++;
            else alpha[ch - 97]++;
        }
    }

    ch = 'a';
    for(i = 0; i < 26; i++, ch++){
        printf("%c : %d\n", ch, alpha[i]);
    }
}
