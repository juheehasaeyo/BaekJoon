# 4344 평균은 넘겠지
c = int(input())
for _ in range(0, c):
    data = list(map(int, input().split()))
    t = data[0]
    # 두 번째 원소부터 마지막 원소까지 할당
    scores = data[1:]

    avg = sum(scores) / t
    cnt = 0
    for score in scores:
        if score > avg:
            cnt += 1
    res = (cnt / t) * 100
    print("%.3f" % res,"%")