n,k = map(int,input().split())
e = []
v = []
for i in range(1,n+1):
    if i%2 == 0:
        e.append(i)
    else:
        v.append(i)
r = v + e
print(r[k-1])