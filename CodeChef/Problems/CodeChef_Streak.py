t = int(input())

while t > 0:
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    t -= 1
    az,bz = 0,0
    mo,me = 0,0
    for i in a:
        if i==0:
            az = 0
        else: 
            az+=1
        me = max(me,az)
    for j in b:
        if j ==0:
            bz = 0
        else:
            bz += 1
        mo = max(mo,bz)
    if (mo>me): print("Addy")
    elif (mo<me): print("Om")
    else: print("Draw")