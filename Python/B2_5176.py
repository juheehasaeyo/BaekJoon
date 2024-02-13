# 5176 대회 자리
k = int(input())

for _ in range(0, k):
    p, m = map(int, input().split())
    # 배열 arr를 0으로 초기화하고 배열의 크기는 m+1로 설정
    arr = [0] * (m+1)
    cnt = 0
    for i in range(p):
        index = int(input())
        if arr[index] == 0:
            # 이미 선택된 자리인 경우
            arr[index] = 1
            # 아직 아무도 앉지 않았으면 0
        else:
            cnt += 1
    print(cnt)