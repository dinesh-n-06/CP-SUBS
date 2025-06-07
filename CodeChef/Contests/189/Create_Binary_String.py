for _ in range(int(input())):
    n,a,b,c,d = map(int,input().split())
    ans = 0
    for i in range(n+1):
        o = n-i
        val1 = (a*i)+(b*0)+(c*o*i)
        val2 = (a*i)+(b*o)+(d*o*i)
        ans= max(val1,ans,val2)
    print(ans)
    