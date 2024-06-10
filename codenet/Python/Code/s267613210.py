import sys
input = lambda: sys.stdin.readline().rstrip()
input_nums = lambda: list(map(int, input().split()))

def main():
    K, N = input_nums()
    A = input_nums()
    dist = []
    for i in range(len(A)-1):
        dist.append(A[i+1]-A[i])
    dist.append(K+A[0]-A[-1])
    maxv = max(dist)
    print(sum(dist) - maxv)
    

if __name__ == '__main__':
    main()