# 4766 일반 화학 실험
one = float(input())
while True:
    temp = float(input())
    if temp == 999:
        break
    res = temp - one
    print("%.2f" % (res))
    # 현재 온도를 다음 루프에서 이전 온도로 사용
    one = temp