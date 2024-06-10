a , b , h , m = map ( int , input ( ).split ( ) )
import math
C = abs ( 360 / 60 * m - 360 / 12 * h - 360 / 12 / 60 * m )
if C > 180 :
    C = 360 - C
cosC = math.cos ( math.radians ( C ) )
print ( math.sqrt ( a ** 2 + b ** 2 - 2 * a * b * cosC ) )

