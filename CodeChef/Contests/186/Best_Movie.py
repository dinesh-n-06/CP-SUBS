import heapq
for _ in range(int(input())):
    n = int(input())
    a = []
    for _ in range(n):
        r,c = map(int,input().split())
        a.append((c,r))
    h = []
    for x,y in a:
        if y>=7:
            heapq.heappush(h,x)
    print(heapq.heappop(h) if h else -1)