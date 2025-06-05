import heapq
for _ in range(int(input())):
    n,k= map(int,input().split())
    a = list(map(int,input().split()))
    b = list(map(int,input().split()))
    pos = [0]*(n+1)
    for i in range(n):
        pos[a[i]] = i
    pre = [0]*(n+1)
    total = 0
    heap = []
    for lvl in range(1,n+1):
        pre[lvl] = total
        idx = pos[lvl]
        coins = b[idx]
        heapq.heappush(heap,coins)
        total += coins
        if len(heap)>k:
            small = heapq.heappop(heap)
            total-=small
    for i in range(n):
        print(pre[a[i]],end=' ')
    print()
