txt = input ( )
cu = 0
cl = 0
for z in txt :
    if z.islower ( ) :
        cl = cl + 1
    else :
        cu = cu + 1
if cu > cl :
    out = txt.upper ( )
else :
    out = txt.lower ( )
print ( out )

