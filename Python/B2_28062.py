# 28062 준석이의 사탕 사기
n = int(input())
candy = list(map(int, input().split()))

candy_sum = sum(candy)

if candy_sum % 2 == 0:
    print(candy_sum)
else:
    # 초기값을 무한대로 설정.. 하는 거래
    min_candy = float('inf')
    for i in candy:
        if i % 2 != 0:
            min_candy = min(min_candy, i)
    candy_sum = candy_sum - min_candy
    print(candy_sum)