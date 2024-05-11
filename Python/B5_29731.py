# 29731 2033년 밈 투표
n = int(input())
arr = ['Never gonna give you up','Never gonna let you down','Never gonna run around and desert you','Never gonna make you cry','Never gonna say goodbye','Never gonna tell a lie and hurt you','Never gonna stop']
res = []
for _ in range(n):
    str = input()
    res.append(str)
# res 리스트의 모든 요소들이 arr 리스트 안에 있는지 확인
if all(item in arr for item in res):
    print('No')
else:
    print('Yes')