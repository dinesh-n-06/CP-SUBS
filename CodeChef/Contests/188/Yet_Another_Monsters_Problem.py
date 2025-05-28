def ans(a):
    a.sort()
    mt = len(a)
    i = 0
    while i<n:
        d = a[i]
        while i<n and d==a[i]:
            i+=1
        kill = n-i
        tt = d+kill
        mt = min(tt,mt)
    return mt 
for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    print(ans(a))
          
        