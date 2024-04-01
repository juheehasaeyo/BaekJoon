# 10814 나이순 정렬
from functools import cmp_to_key

n = int(input())
arr = []
for i in range(n):
    age, name = map(str, input().split())
    age = int(age)
    arr.append([age, name, i])
    
# 오름차순 정렬 example
# arr = [ [21, 'Junkyu'] , [21, 'Dohyun'] , [20, 'Sunyoung'] ]
# arr[0] = [21, 'Junkyu']
# arr[0][0] = 21
# arr[0][1] = 'Junkyu'
# arr[1][1] = 'Dohyun'
def sorted_age(a, b):
    if a[0] == b[0]:
        return a[2] - b[2]
    else:
        return a[0] - b[0]

sorted_name = sorted(arr, key = cmp_to_key(sorted_age))

for age, name, _ in sorted_name:
    print(age, name)