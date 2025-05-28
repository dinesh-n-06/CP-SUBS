for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    ev = od = 0
    for i in range(n):
        if (i%2==0):
            ev+=a[i]
        else: od+=a[i]
    print(ev if ev>od else od)