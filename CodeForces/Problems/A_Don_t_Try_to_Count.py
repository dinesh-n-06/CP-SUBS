from collections import Counter
for _ in range(int(input())):
    n,m = map(int,input().split())
    a = input()
    s = input()
    f = False
    for i in range(6):
        if s in a:
            ans = i
            f = True
            break
        a = a+a
    print(ans if f else -1)        
