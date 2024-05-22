# 4892 숫자 맞추기 게임
idx = 0
while True:
    n0 = int(input())
    idx += 1
    if n0 == 0:
        break
    n1 = 3 * n0
    if n1 % 2 == 0:
        n2 = n1 / 2
    else:
        n2 = (n1 + 1) / 2
    n3 = 3 * n2
    n4 = n3 / 9
    if n1 % 2 == 0:
        res = "even"
    else:
        res = "odd"
    print('{}. {} {}'.format(idx, res, int(n4)))