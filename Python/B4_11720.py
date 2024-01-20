# 11720 숫자의 합
n = int(input(""))
# split()은 문자열이 공백을 기준으로 나뉘고, rstrip()은 공백없이 한 문자씩 입력 받음
n_list = list(map(int, input().rstrip()))
for i in n_list:
    total_sum = sum(n_list)
print(total_sum)