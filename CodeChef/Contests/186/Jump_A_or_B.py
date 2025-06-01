for _ in range(int(input())):
    n,m,a,b = map(int,input().split())
    if a == b:
        if m==a*n:
            print("Yes")
        else:
            print("No")
    else:
        num = m-(n*a)
        den = b-a
        if den==0:
            print("No")
            continue
        if num % den != 0:
            print("No")
            continue
        x = num // den
        if 0<=x<=n:
            print("Yes")
        else:
            print("No")