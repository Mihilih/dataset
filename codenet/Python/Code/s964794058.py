memTime = int(input())
memLate = input().split()
memLate = [int(i) for i in memLate]
colorList = []
memColor = 0
highLate = 0
for color in range(memTime):
    member = memLate[color]
    if member // 400 >= 8:
        highLate += 1
    elif ((member // 400) in colorList) == False:
        colorList.append(member // 400)
maxColor = len(colorList) + highLate
minColor = len(colorList)
if minColor == 0:
    minColor = 1
print(str(minColor) + " " + str(maxColor))