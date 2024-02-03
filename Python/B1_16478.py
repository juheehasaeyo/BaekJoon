# 16478 원의 분할
p_ab, p_bc, p_cd = map(int, input().split())
p_ad = p_ab*p_cd / p_bc
if p_ad.is_integer():
    print(int(p_ad))
else:
    print(p_ad)