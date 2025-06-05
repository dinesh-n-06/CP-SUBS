for _ in range(int(input())):
    n,k= map(int,input().split())
    a = list(map(int,input().split()))
    ans = 0
    ate = 0
    f = True
    for i in a:
        ans+=1
        if i+ate<k:
            print(f"NO {ans}")
            f = False    
            break
        ate += i-k
        
    if f: print("YES")
        