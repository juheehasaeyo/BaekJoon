# 16727 ICPC
p1, s1 = map(int, input().split())
s2, p2 = map(int, input().split())
p_score = p1 + p2
s_score = s1 + s2
if p_score > s_score:
    print("Persepolis")
elif p_score < s_score:
    print("Esteghlal")
else:
    if p2 > s1:
        print("Persepolis")
    elif p2 < s1:
        print("Esteghlal")
    else:
        print("Penalty")