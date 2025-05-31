for _ in range(int(input())):
    a,b,c,d = map(int, input().split())
    if b<=a and b<=c:
        print("Gellyfish")
    elif a<d:
        print("Flower")
    elif d<=c:
        print("Gellyfish")
    else:
       print("Flower")
   