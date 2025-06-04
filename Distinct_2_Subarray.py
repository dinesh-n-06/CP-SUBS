for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    c=0
    for i in range(n+1):
        if len(set(a[:i])) >= 2:
            c+=1
    print(c if c>0 else -1)