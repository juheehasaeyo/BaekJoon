# 17350 2루수 이름이 뭐야
t = int(input())
res = "뭐야?"
for i in range(0, t):
    name = input()
    if name == "anj":
        res = "뭐야;"
        break
print(res)