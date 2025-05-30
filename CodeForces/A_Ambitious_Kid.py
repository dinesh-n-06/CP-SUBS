n = int(input())
a = list(map(int, input().split()))
b = [abs(i) for i in a]
print(min(b))
    
    