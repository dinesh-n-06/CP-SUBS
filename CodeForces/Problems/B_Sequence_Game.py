for _ in range(int(input())):
    n = int(input())
    a = list(map(int, input().split()))
    b = []
    b.append(a[0])
    for i in range(1,n):
        if a[i-1]<=a[i]: b.append(a[i])
        else: 
            b.append(a[i])
            b.append(a[i])
    print(len(b))
    print(*b)
