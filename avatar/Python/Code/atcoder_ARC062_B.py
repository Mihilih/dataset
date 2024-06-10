s = list ( input ( ) )
num_g , num_p = 0 , 0
score = 0
for x in s :
    if x == 'g' :
        if num_g - num_p > 0 :
            score += 1
            num_p += 1
        else :
            score = score
            num_g += 1
    elif x == 'p' :
        if num_g - num_p > 0 :
            score = score
            num_p += 1
        else :
            score -= 1
            num_g += 1
print ( score )

