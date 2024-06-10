# -*- coding: utf-8 -*-
# https://atcoder.jp/contests/abc126/tasks/abc126_d

import sys
sys.setrecursionlimit(100000)

def dfs(i):
  for v,w in V.get(i, []):
    if (w % 2) == 0:
      if color[v] == -1:
        color[v] = color[i]
      elif color[v] == color[i]:
        continue
      elif color[v] != color[i]:
        return False
    else:
      if color[v] == -1:
        color[v] = 0 if color[i] else 1
      elif color[v] == color[i]:
        return False
      elif color[v] != color[i]:
        continue
    dfs(v)
  return True

if __name__ == '__main__':
  n = int(input())
  V = {} # key:vertex, value:[[vertex opposited, wight]]
  color = {} # 0 or 1 or -1
  for i in range(1, n):
    u,v,w = map(int, input().split())
    if not V.get(u, False):
      V[u] = [[v,w]]
    else:
      V[u].append([v,w])

    if not V.get(v, False):
      V[v] = [[u,w]]
    else:
      V[v].append([u,w])
    # 同じ頂点間で複数の辺はないと仮定
  for i in range(1, n+1):
    color[i] = -1

  while True:
    i = 0
    for j in range(1, n+1):
      if color[j] == -1:
        i = j
        color[i] = 0
        break
    if i == 0:
      for j in range(1, n+1):
        print(color[j])
      break
    else:
      if not dfs(i):
        print('No')
        break

  