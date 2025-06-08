for _ in range(int(input())):
    t,n,sm = map(int,input().split())
    calc = 0
    full = sm//n
    rem = sm%n
    if full>t:
        full = t
        rem=0
    calc= full*(n**2)
    if full < t and rem>0:
        calc+=(rem**2)
    print(calc)