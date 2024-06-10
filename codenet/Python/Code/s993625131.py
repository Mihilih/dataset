S = list(input())

count = 0
record = 0
for i in range(len(S)):
    if S[i] == "A" or S[i] == "C" or S[i] == "G" or S[i] == "T":
        count += 1
    else:
        if count > record:
            record = count
        count = 0
if count>record:
    record = count

print(record)