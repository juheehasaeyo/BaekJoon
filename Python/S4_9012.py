# 9012 괄호
t = int(input())
for _ in range(t):
    ps = input()
    cnt = 0
    for char in ps:
        if char == '(':
            cnt += 1
        elif char == ')':
            cnt -= 1
            if cnt < 0:
                print("NO")
                break
    else:
        if cnt == 0:
            print("YES")
        else:
            print("NO")