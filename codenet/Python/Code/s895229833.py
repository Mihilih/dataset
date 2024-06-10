N = int(input())
H = list(map(int, list(input().split())))

count_best, count_tmp = 0, 0

for i in range(N-1):                                                                                                                                                                                        
    if H[i] >= H[i+1]:                                                                                                                                                                                      
        count_tmp += 1                                                                                                                                                                                      
    else:                                                                                                                                                                                                   
        if count_tmp > count_best:                                                                                                                                                                          
            count_best = count_tmp                                                                                                                                                                          
                                                                                                                                                                                                            
        count_tmp = 0                                                                                                                                                                                       

if count_tmp > count_best:                                                                                                                                                                                  
    count_best = count_tmp                                                                                                                                                                                  

print(count_best)