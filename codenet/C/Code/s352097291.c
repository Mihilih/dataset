#include <stdio.h>
#include <string.h>
int main(){
    char c[11],ans[11]={'\0'};
    scanf("%s",c);
    for(int i=0;c[i]!='\0';i++){
        if(c[i]!='B')
            ans[strlen(ans)] = c[i];
        else
            ans[strlen(ans)-1]='\0';
    }
    printf("%s\n",ans);
}