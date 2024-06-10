LUCKY = "abcd"
n = int ( input ( ) )
s = ""
for i in range ( n ) :
    s += LUCKY [ i % 4 ]
print ( s )

