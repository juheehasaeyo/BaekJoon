# 4493 가위 바위 보?
t = int(input())
for _ in range(t):
    n = int(input())
    cnt1 = 0
    cnt2 = 0
    for _ in range(n):
        p1, p2 = input().split()
        if p1 == p2:
            continue
        elif (p1 == "R" and p2 == "S") or (p1 == "S" and p2 == "P") or (p1 == "P" and p2 == "R"):
            cnt1 += 1
        else:
            cnt2 += 1
    if cnt1 > cnt2:
        print("Player 1")
    elif cnt1 < cnt2:
        print("Player 2")
    else:
        print("TIE")