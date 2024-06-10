def main():

    N, M, Q = map(int, input().split())
    train = [[0 for _ in range(N)] for _ in range(N)]
    for _ in range(M):
        l, r = map(int, input().split())
        train[l-1][r-1] += 1

    accum = [[0 for _ in range(N+1)]]
    for i in range(N):
        temp = [0]
        v = 0
        for j in range(N):
            v += train[i][j]
            temp.append(accum[-1][j+1]+v)
        accum.append(temp)
        # print(temp)

    for _ in range(Q):
        p, q = map(int, input().split())
        v = accum[q][q] - accum[p-1][q] - accum[q][p-1] + accum[p-1][p-1]
        print(v)

if __name__ == '__main__':
    main()