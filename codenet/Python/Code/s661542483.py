H = int(input())

count = 0

def dfs(h):
  if h == 1:
    return 1

  return dfs(h // 2) * 2 + 1

print(dfs(H))