def leapyear ( n ) :
    if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
        return "y"
    else :
        return "n"
n = int ( input ( ) )
d = "f"
if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
    ans = "ly"
else :
    ans = "nly"
while ( True ) :
    if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
        if ( d == "m" ) :
            d = "w"
            n += 1
        elif ( d == "t" ) :
            d = "th"
            n += 1
        elif ( d == "w" ) :
            d = "f"
            n += 1
        elif ( d == "th" ) :
            d = "sa"
            n += 1
        elif ( d == "f" ) :
            d = "s"
            n += 1
        elif ( d == "sa" ) :
            d = "m"
            n += 1
        elif ( d == "s" ) :
            d = "t"
            n += 1
    else :
        if ( d == "m" ) :
            d = "t"
            n += 1
        elif ( d == "t" ) :
            d = "w"
            n += 1
        elif ( d == "w" ) :
            d = "th"
            n += 1
        elif ( d == "th" ) :
            d = "f"
            n += 1
        elif ( d == "f" ) :
            d = "sa"
            n += 1
        elif ( d == "sa" ) :
            d = "s"
            n += 1
        elif ( d == "s" ) :
            d = "m"
            n += 1
    if ( d == "f" and ans == "ly" and leapyear ( n ) == "y" ) :
        break
    elif ( d == "f" and ans == "nly" and leapyear ( n ) == "n" ) :
        break
print ( n )

