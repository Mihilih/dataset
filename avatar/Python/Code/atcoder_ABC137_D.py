import heapq
n , m = map ( int , input ( ).split ( ) )
x = [ ]
y = [ ]
for i in range ( n ) :
    day , salary = map ( int , input ( ).split ( ) )
    heapq.heappush ( x , ( - day , - salary ) )
while x :
    d , s = heapq.heappop ( x )
    r = m - len ( y )
    if r >= - d :
        heapq.heappush ( y , - s )
    else :
        heapq.heappush ( y , - s )
        heapq.heappop ( y )
print ( sum ( y ) )

