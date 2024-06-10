n=int(input())
s=input()

r_cnt = s.count('R')
g_cnt = s.count('G')
b_cnt = s.count('B')

ans = r_cnt * g_cnt * b_cnt

for i in range(n):
    for d in range(n):
        j = i + d
        k = j + d
        if k >= n:
            break 
#        logging.debug("{},{},{}".format(s[i],s[j],s[k]))
        if s[i] != s[j] and s[j] != s[k] and s[k] != s[i]:
#            logging.debug("☆")
            ans -= 1
print(ans)