N = int(input())
cnt = 1
while cnt <= 9:
    if N%cnt == 0 and 1 <= N/cnt <= 9:
            print('Yes')
            break
    else:
        cnt += 1
else:
    print('No')