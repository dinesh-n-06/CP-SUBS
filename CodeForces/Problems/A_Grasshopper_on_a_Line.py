for _ in range(int(input())):
    n,k = map(int,input().split())
    if (n%k!=0):
        print(1)
        print(n)
    else:
        print(2)
        print(n-k-1,k+1)
    