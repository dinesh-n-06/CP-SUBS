for _ in range(int(input())):
    x, y, k = map(int, input().split())
    winner = "Bob"
    if(k >= max(x,y)):
        winner = "Alice"
    elif(k < max(x,y) and k >= min(x,y)):
        if (max((x-y),(y-x)) <= k or max(x,y) <= 2*k):
            winner = "Alice"
    print(winner)