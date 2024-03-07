# 21866 추첨을 통해 커피를 받자
max_score = [100, 100, 200, 200, 300, 300, 400, 400, 500]
total_score = 0
bl = 0
score = list(map(int, input().split()))
for i in range(9):
    if score[i] > max_score[i]:
        bl = 1
    total_score += score[i]
if bl:
    print("hacker")
else:
    print("draw" if total_score >= 100 else "none")