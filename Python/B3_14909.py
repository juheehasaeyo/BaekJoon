# 14909 양수 개수 세기
cnt = 0
n = list(map(int, input().split()))
# 리스트 n의 각 원소에 대해 반복
for i in n:
    if i > 0:
        cnt += 1
print(cnt)