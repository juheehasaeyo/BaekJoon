# 2755 이번학기 평점은 몇점?
t = int(input())
sum = 0
total_grade = 0

for _ in range(t):
    subject, su, grade = input().split()
    su = int(su)
    if grade == "A+":
        res = 4.3
    elif grade == "A0":
        res = 4.0
    elif grade == "A-":
        res = 3.7
    elif grade == "B+":
        res = 3.3
    elif grade == "B0":
        res = 3.0
    elif grade == "B-":
        res = 2.7
    elif grade == "C+":
        res = 2.3
    elif grade == "C0":
        res = 2.0
    elif grade == "C-":
        res = 1.7
    elif grade == "D+":
        res = 1.3
    elif grade == "D0":
        res = 1.0
    elif grade == "D-":
        res = 0.7
    elif grade == "F":
        res = 0.0
    sum += su
    total_grade += su * res

# 평균 평점 계산
avg_grade = total_grade / sum
# 평균 평점을 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력
print('%.2f' % round(avg_grade + 0.0000001, 2))