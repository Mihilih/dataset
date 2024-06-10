R, G, B, N = map(int, input().split())

score = 0
for i in range(N // R + 1):
    for j in range((N-i * R) // G + 1):
        if N - i * R - j * G >= 0 and (N - i * R - j * G) % B == 0:
            score += 1

print(score)