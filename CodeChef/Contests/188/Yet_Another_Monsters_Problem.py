for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    a.sort()
    ans = n
    for i in range(n):
        ans = min(ans,a[i]+(n-i-1))
    print(ans)

          
        