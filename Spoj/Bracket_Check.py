a = input()
s = []
if len(a)%2!=0:
    print('No')
else:
    for i in a:
        if i == '(':
            s.append(')')
        elif i == '[':
            s.append(']')
        elif i == '{':
            s.append('}')
        elif i == '<':
            s.append('>')
        else:
            if s and i == s[-1]:
                s.pop()
            else: 
                print('No')
                break
    else:
        print('Yes' if len(s)==0 else 'No')
    
    