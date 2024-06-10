
def main():
    X, K, D = map(int, input().split())

    r = X // D
    if abs(r) > K:
        print(abs(X) - K * D)
        exit()
    a = X - r * D
    if (K - r) % 2 == 0:
        print(a)
    else:
        print(abs(D - a))
    


if __name__ == '__main__':
    main()