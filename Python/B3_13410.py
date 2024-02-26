# 13410 거꾸로 구구단
n, k = map(int, input().split())
answer = 0
for i in range(1, k+1):
    num = n * i
    # num을 String형으로 변환 후 문자열 슬라이싱
    # -1로 뒤에서부터 거꾸로 뒤집기
    # 뒤집은 문자열을 다시 int형으로 변환 후 최댓값 비교
    rev_res = int(str(num)[::-1])
    answer = max(answer, rev_res)
print(answer)