for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    ans = 9999
    for i in range(n+1):
        if len(set(a[:i])) >= 2:
            ans = min(ans,len(set(a[:i])))
    print(ans if ans!=9999 else -1)