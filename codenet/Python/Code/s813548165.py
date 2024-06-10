N = int(input())
S,T = input().split()

char_lists = []

for i,char in enumerate(S):
    char_lists.append(char)
    char_lists.append(T[i])

print("".join(char_lists))