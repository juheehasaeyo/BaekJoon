# 4641 Doubles
while True:
    num = list(map(int, input().split()))
    if num[0] == -1:
        break
    cnt = 0
    for i in range(len(num)):
        for j in range(len(num)):
            # 같은 인덱스에 있는 숫자들을 비교하지 않도록 i != j 설정
            if i != j and num[i] * 2 == num[j]:
                cnt += 1
    print(cnt)