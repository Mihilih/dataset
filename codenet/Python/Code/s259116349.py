from math import factorial as f

N = int(input())

primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47]
divs = []
for i in range(1,101):
    tmp = [0 for _ in range(len(primes))]
    for j in range(len(primes)):
        p = primes[j]
        tmp[j] = 0
        while(i//p==i/p):
            i = i//p
            tmp[j] += 1
    divs.append(tmp)
#print(divs)

divsum = [0 for _ in range(len(primes))]
for i in range(1, N+1):
    for j in range(len(primes)):
        divsum[j] += divs[i-1][j]
#print(divsum)

def num(n):
    return len(list(filter(lambda x:x>=n-1, divsum)))

ans = 0

# >=74
ans += num(75)

# >=14 & 13~4
ans += num(15)*(num(5)-1)

# >=24 & 23~2
ans += num(25)*(num(3)-1)

# >=4,>=4 & >=2
ans += num(5) * (num(5)-1) * (num(3)-2) // 2 
print(int(ans))
