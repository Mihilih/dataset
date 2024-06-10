n = int ( input ( ) )
l = [ ]
for i in range ( n ) :
    l.append ( int ( input ( ) ) )
ans = n - 1
last = 0
for i in l :
    ans += abs ( last - i ) + 1
    last = i
print ( ans )

