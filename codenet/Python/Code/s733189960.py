def main():
  n = int(input())
  sdic = {}
  for _ in range(n):
    s = [_s for _s in sorted(input().strip())]
    s = ''.join(s)
    if s in sdic:
      sdic[s] += 1
    else:
      sdic[s] = 1
  ans = 0
  for k, v in sdic.items():
    ans += v*(v-1)//2
  print(ans)


if __name__ == '__main__':
  main()
