for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    flag = True
    su = sum(a)
    one = two = zero = 0
    for i in a:
        if i%3==0:
            print("Yes")
            flag = False
            break
        elif i%3 ==2:
            two+=1
        else:
            one+=1
    if flag:
        print("Yes" if ((two>=1 and one>=1) or two>=3 or one>=3) else "No")