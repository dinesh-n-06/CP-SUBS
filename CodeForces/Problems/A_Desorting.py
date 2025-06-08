def solve(a,n):
    diff = float('inf')
    for i in range(1,n):
        if a[i-1]<=a[i]:
            diff = min(diff,(a[i]-a[i-1])//2+1)
        else:
            return 0
    return diff

for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    print(solve(a,n))