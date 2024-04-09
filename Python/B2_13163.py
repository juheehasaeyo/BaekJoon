# 13163 닉네임에 갓 붙이기
n = int(input())
for i in range(0,n):
    name = list(map(str, input().split()))
    name.remove(name[0])
    name.insert(0, "god")

    res = ""

    for j in range(len(name)):
        res += name[j]

    print(res)