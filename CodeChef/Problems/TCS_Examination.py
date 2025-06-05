for _ in range(int(input())):
    a = list(map(int,input().split()))
    b = list(map(int,input().split()))
    if sum(a) > sum(b):
        print("DRAGON")
    elif sum(a) < sum(b):
        print("SLOTH")
    else:
        if a[0] > b[0]:
            print("DRAGON")
        elif a[0] < b[0]:
            print("SLOTH")
        elif a[1] > b[1]:
            print("DRAGON")
        elif a[1] < b[1]:
            print("SLOTH")
        else:
            print("TIE")