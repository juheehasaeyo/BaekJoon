# 1817 짐 챙기는 숌
n, m = map(int, input().split())
cnt = 0
if n == 0:
    print("0")
else:
    book_weight = list(map(int, input().split()))
    # 현재 박스에 담긴 책 무게
    weight = 0
    cnt = 1
    for i in book_weight:
        if i + weight <= m:
            weight += i
        else:
            weight = i
            cnt += 1
    print(cnt)