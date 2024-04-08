# 10825 국영수
from functools import cmp_to_key
# 	         a       b   c   d	        a      b   c   d
# arr = ['[Junkyu', 50, 60, 100], ['Sangkeun', 80, 60, 50]]

n = int(input())
arr = []
for i in range(n):
	name, kor, eng, math = map(str, input().split())
	kor = int(kor)
	eng = int(eng)
	math = int(math)
	arr.append([name, kor, eng, math])

def compare_students(a, b):
    if a[1] == b[1]:  # 국어 점수가 같을 때
        if a[2] == b[2]:  # 영어 점수가 같을 때
            if a[3] == b[3]:  # 수학 점수가 같을 때
                return (a[0] > b[0]) - (a[0] < b[0])  # 이름의 알파벳 순으로 비교
            return b[3] - a[3]
        return a[2] - b[2]
    return b[1] - a[1]

arr.sort(key = cmp_to_key(compare_students))

for result in arr:
    print(result[0])