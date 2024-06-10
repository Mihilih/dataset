#!python3

# input
N = int(input())
A = list(map(int, input().split()))


def main():
    A.sort()
    ans = A[-1] - A[0]
    print(ans)


if __name__ == "__main__":
    main()
