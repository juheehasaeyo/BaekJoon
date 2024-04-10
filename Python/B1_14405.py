# 14405 피카츄
str = input()

str = str.replace("pi", " ")
str = str.replace("ka", " ")
str = str.replace("chu", " ")

if len(str.strip()) == 0:
    print("YES")
else:
    print("NO")