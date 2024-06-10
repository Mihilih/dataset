import math

def keta(s):
    if len(s) < 2:
        return int(s)
    n = sum(map(int, s))
    return keta(str(n))

def main():
    N = input()
    # N, X, T = list(map(int, input().split()))
    
    if keta(N) % 9 == 0:
        print("Yes")
    else:
        print("No")



if __name__ == "__main__":
    main()