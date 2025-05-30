from collections import Counter
for _ in range(int(input())):
    k = int(input())
    a = list(map(int,input().split()))
    c= Counter(a)
    f = True
    for v in c.values():
        if v>2:
            print("No")
            f = False    
            break 
    if f: print("Yes")