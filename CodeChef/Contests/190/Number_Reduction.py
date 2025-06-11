for _ in range(int(input())):
    n = int(input())
    while n>3 or n%2==0:
        if n%2==0:
            n//=2
        else:
            n-=3
    print(n)