for _ in range(int(input())):
    n,x = map(int,input().split())
    ans = [0]*(n+1)
    ans = [i for i in range(n+1)]
    for i in range(1,n+1):
        if ans[i]!=i: continue
        if i|x != x: continue
        j = i^x
        if j<1 or j>n: continue
        ans[i],ans[j] = ans[j],ans[i]
    print(*ans[1:])

    