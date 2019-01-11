#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the decentNumber function below.
def decentNumber(n):
    ans = -1
    # If n is completely divisible by 3, then all digits are 5
    if n%3==0:
        ans = n*'5'
    # if n is not completely divisible by 3, then
    # we'll check what's the gratest number less than n
    # that is divisible by 3
    # that number will represent the number of 5 in the decent number
    # and the rest the number of 3 in decent number if the rest is divisible
    # by 5
    elif n%3!=0:
        for i in range(n-5,-1,-5):
            if i%3==0 and (n-i)%5==0:
                ans = '5'*i + '3'*(n-i)
                break
    elif n%5==0:
        ans = n*'3'
    else:
        ans = -1
    print(ans)
    #return ans

if __name__ == '__main__':
    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        decentNumber(n)
