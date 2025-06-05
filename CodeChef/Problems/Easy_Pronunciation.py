for _ in range(int(input())):
    n = int(input())
    a = input()
    v = 'aeiou'
    count = 0
    ans = 0
    for i in a:
        if i not in v:
            count+=1
            ans = max(ans,count)
        else:
            count = 0
    print("NO" if ans>=4 else "YES")