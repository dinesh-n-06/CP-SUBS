import heapq
for _ in range(int(input())):
    a = list(map(int,input().split()))
    n = len(a)
    heapq.heapify(a)
    avg = sum(a)
    if avg>= 35:
        print(0)
    else:
        g = 0
        while avg<35:
            x = heapq.heappop(a)
            avg += (10-x)
            heapq.heappush(a,10)
            g+=100
        print(g)