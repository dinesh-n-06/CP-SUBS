MOD = 998244353
for _ in range(int(input())):
    n = int(input())
    a = list(map(int, input().split()))
    a.sort()
    ans = 1
    for i in range(n):
        ans *= (a[i] - i)   
        ans %= MOD
    print(ans)