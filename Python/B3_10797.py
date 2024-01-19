// 10797 10부제
t = int(input(""))
n_list = list(map(int, input().split()))
cnt = 0
for i in n_list:
    if t == i:
        cnt += 1
print(cnt)