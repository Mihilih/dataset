import sys

readline = sys.stdin.readline
MOD = 10 ** 9 + 7
INF = float('INF')
sys.setrecursionlimit(10 ** 5)


def main():
    N = int(readline())
    s = {1, 2, 4, 8, 16, 32, 64}
    ans = 0

    for i in range(1, N + 1):
        if i in s:
            ans = i

    print(ans)


if __name__ == '__main__':
    main()
