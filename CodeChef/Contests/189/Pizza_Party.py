import math
b,g = map(int,input().split())
total = ((b+1)*4)+(g*3)
print(math.ceil(total/8))