def solution(n, m, k):
    ans = 0
    total = n * m
    if total <=k: return 0
    if k ==0 : return total
    for i in range(1,n+1):
        pa = m*i
        pb= (n-i)*m
        if pa>=k: ans= max(ans, pb)
        if pb>=k: ans= max(ans, pa)
    for i in range(1,m+1):
        pa = n*i
        pb= (m-i)*n
        if pa>=k: ans= max(ans, pb)
        if pb>=k: ans= max(ans, pa)
    return ans

for _ in range(int(input())):
    n,m,k = map(int,input().split())
    print(solution(n,m,k))