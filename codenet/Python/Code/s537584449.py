a = int(input())

def func(a):
    digits = []
    temp = a
    while temp != 0:
        digits.append(temp%10)
        temp = int(temp/10)
    result = sum(digits)
    if result == 1:
        print('10')
    else:
        print(result)

func(a)