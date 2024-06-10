"""
i が 3 でも 5 でも割り切れるなら、ai=FizzBuzz
そうではなく i
が 3 で割り切れるなら、ai=Fizz
そうではなく i
が 5 で割り切れるなら、ai=Buzz
そうではないなら、ai=i
"""
n=int(input())
r=0
for ii in range(n):
  if (ii+1)%3!=0 and (ii+1)%5!=0:
    r+=(ii+1)
print(r)