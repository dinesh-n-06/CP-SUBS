for _ in range(int(input())):
    n,c = map(int,input().split())
    a = list(map(int,input().split()))
    b = list(map(int,input().split()))
    d = {}
    for i in range(n):
        if a[i] not in d:
            d[a[i]] = b[i]
        else:
            if d[a[i]]>b[i]:
                d[a[i]] = b[i]
    val = sorted(d.values())
    total = 0
    ans = 0
    for i in range(len(val)):
        total+=val[i]
        ans = max(ans,(((i+1)*c)-total))
    print(ans)