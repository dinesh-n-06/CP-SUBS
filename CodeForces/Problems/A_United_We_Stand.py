for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    m = max(a)
    b,c = [],[]
    for i in a:
        if i==m:
            c.append(i)
        else: b.append(i)
    if len(b)==0 or len(c)==0: print(-1)
    else:
        print(f"{len(b)} {len(c)}")
        print(*b)
        print(*c)