n = int(input())
a = list(map(int,input().split()))

ans = 0
for x in range(0,n+1):
    count = sum(1 for i in a if i>=x)
    if count>=x:
        ans = max(x,ans)
print(ans)