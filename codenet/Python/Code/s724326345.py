def main():
    A, B, C, X, Y = map(int, input().split())
    ans = 10 ** 10

    for k in range(max(X, Y) + 1):
        total = 2 * C * k + A * max(0, X - k) + B * max(0, Y - k)
        if total < ans:
            ans = total

    print(ans)


if __name__ == "__main__":
    main()
