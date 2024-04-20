# 8974 희주의 수학시험
a, b = map(int, input().split())
arr = []
for i in range(1, b+1):
    if len(arr) < b:
        for _ in range(i):
            # 1을 1번, 2를 2번, i를 i번 리스트에 추가하여 수열을 만든다
            arr.append(i)
# a번째부터 b번째까지의 합
print(sum(arr[a-1:b]))