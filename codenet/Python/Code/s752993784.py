s = list(input())
mods = [0]*(len(s))
countRemainder = [0] * 2019
cnt = 0


m = 1
mod = 0
for i in range(len(s)):
    mod += int(s[len(s) - i - 1]) * m

    mod %= 2019
    m *= 10
    m %= 2019

    countRemainder[mod] += 1

countRemainder[0] += 1

for i in range(2019):
    cnt += int(countRemainder[i] * (countRemainder[i] - 1) / 2)

print(cnt)

