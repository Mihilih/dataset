from collections import defaultdict , deque
from functools import lru_cache
from heapq import heappush , heappop
from typing import Counter
from bisect import bisect_right , bisect_left
import math
hpop = heappop
hpush = heappush
def solution ( ) :
    line = input ( )
    bought_count = Counter ( line )
    line = input ( )
    made_cout = Counter ( line )
    res = 0
    for color in made_cout :
        if color not in bought_count :
            return print ( - 1 )
        res += min ( bought_count [ color ] , made_cout [ color ] )
    print ( res )
def main ( ) :
    t = 1
    for _ in range ( t ) :
        solution ( )
main ( )

