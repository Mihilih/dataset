#include <string.h>
#include <stdio.h>

int calc_score() {                                                              
    int out = 0;                                                                
    char str[100];                                                              
    int score = 0;                                                              
    int base = 0;                                                               
                                                                                
    while (out < 3) {                                                           
        scanf("%s", str);                                                       
        if (strcmp(str, "OUT") == 0) {                                          
            out++;                                                              
        } else if (strcmp(str, "HIT") == 0) {                                   
            if (base == 3) {                                                    
                score++;                                                        
            } else {                                                            
                base++;                                                         
            }                                                                   
        } else if (strcmp(str, "HOMERUN") == 0) {                               
            score += (base + 1);                                                
            base = 0;                                                           
        }                                                                       
    }                                                                           
                                                                                
    return score;                                                               
}

int main(void) {                                                                
    int n;                                                                      
    int inning = 0;                                                             
                                                                                
    scanf("%d", &n);                                                            
                                                                                
    while (inning < n) {                                                        
        printf("%d\n", calc_score());                                           
        inning++;                                                               
    }                                                                           
                                                                                
    return 0;                                                                   
}