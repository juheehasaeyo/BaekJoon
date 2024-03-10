# 17614 369
n = int(input())
clap = 0
for num in range(0, n+1):
    # 숫자를 문자열로 변환
    num_str = str(num)
    clap += num_str.count("3") + num_str.count("6") + num_str.count("9")
print(clap)