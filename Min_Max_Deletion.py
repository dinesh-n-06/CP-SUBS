def solve(b):
    arr = b[:]
    score  = 0
    while len(arr)>1:
        pair = -1
        idx = -1
        for i in range(len(arr)-1):
            m = min(arr[i],arr[i+1])
            if m>pair:
                pair = m
                idx = i
        score += pair
        if arr[idx]>arr[idx+1]:
            arr.pop(idx)
        else:
            arr.pop(idx+1)
    print(score)
    
    
for _ in range(int(input())):
    n,q = map(int,input().split())
    a = list(map(int,input().split()))
    for _ in range(q):
        i,x = map(int,input().split())
        a[i-1] = x
        solve(a)
    
    