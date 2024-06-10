def main():
    q, h, s, d = map(int, input().split())
    n = int(input())
    min_1 = min(q*4, h*2, q*2+h, s)
    min_2 = min(min_1*2, d)

    print((n % 2)*min_1 + (n // 2)*min_2)

if __name__ == '__main__':
    main()
