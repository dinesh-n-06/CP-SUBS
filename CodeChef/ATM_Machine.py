for _ in range(int(input())):
    n,k = map(int,input().split())
    a = list(map(int,input().split()))
    ans = []
    for i in a:
        if i<=k:
            k-=i
            ans.append(1)
        else:
            ans.append(0)
    print("".join(map(str,ans)))
    