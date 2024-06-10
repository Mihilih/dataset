import heapq
const = 0
left = []
right = []

q = int(input())
cnt = 0
left_sum = 0
right_sum = 0
for _ in range(q):
    t = list(map(int, input().split()))
    if t[0] == 1:
        # update
        a, b = t[1:]
        const += b
        if cnt % 2 == 0:
            if not right:
                heapq.heappush(left, -a)
                left_sum += a
                cnt += 1
                #print(left_sum, right_sum, cnt)
                continue

            c = heapq.heappop(right)
            right_sum -= c
            if a <= c:
                heapq.heappush(left, -a)
                heapq.heappush(right, c)
                left_sum += a
                right_sum += c
            else:
                heapq.heappush(left, -c)
                heapq.heappush(right, a)
                left_sum += c
                right_sum += a
        else:
            c = heapq.heappop(left)
            left_sum += c
            if a <= -c:
                heapq.heappush(left, -a)
                heapq.heappush(right, -c)
                left_sum += a
                right_sum -= c
            else:
                heapq.heappush(left, c)
                heapq.heappush(right, a)
                left_sum -= c
                right_sum += a
        cnt += 1
        #print(left_sum, right_sum, cnt)
    else:
        tmp = -left[0]
        print(tmp, const - left_sum + right_sum + tmp * (cnt % 2))

