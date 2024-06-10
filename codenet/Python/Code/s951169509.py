from collections import deque
H, W = map(int, input().split())
G = []
for i in range(H+2):
    if i == 0 or i == H+1:
        G.append('#'*(W+2))
    else:
        G.append('#' + input() + '#')

ans = 0
for sx in range(W+2):
    for sy in range(H+2):
        if G[sy][sx] == '.':
            dist = [[-float('inf') for i in range(W+2)] for i in range(H+2)]
            visited = [[-1 for i in range(W+2)] for i in range(H+2)]
            q = deque([])
            q.append((sx, sy))
            dist[sy][sx] = 0
            visited[sy][sx] = 1
            while q:
                x, y = q.popleft()

                if G[y][x+1] == '.' and visited[y][x+1] == -1:
                    q.append((x+1, y))
                    dist[y][x+1] = dist[y][x] + 1
                    visited[y][x+1] = 1

                if G[y][x-1] == '.' and visited[y][x-1] == -1:
                    q.append((x-1, y))
                    dist[y][x-1] = dist[y][x] + 1
                    visited[y][x-1] = 1

                if G[y+1][x] == '.' and visited[y+1][x] == -1:
                    q.append((x, y+1))
                    dist[y+1][x] = dist[y][x] + 1
                    visited[y+1][x] = 1

                if G[y-1][x] == '.' and visited[y-1][x] == -1:
                    q.append((x, y-1))
                    dist[y-1][x] = dist[y][x] + 1
                    visited[y-1][x] = 1
            for i in range(W+2):
                for j in range(H+2):
                    ans = max(ans, dist[j][i])
print(ans)