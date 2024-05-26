# 4435 중간계 전쟁
t = int(input())
for i in range(1, t+1):
    gandalf = list(map(int, input().split()))
    sourn = list(map(int, input().split()))
    gandalf_score = gandalf[0]*1 + gandalf[1]*2 + gandalf[2]*3 + gandalf[3]*3 + gandalf[4]*4 + gandalf[5]*10
    sourn_score = sourn[0]*1 + sourn[1]*2 + sourn[2]*2 + sourn[3]*2 + sourn[4]*3 + sourn[5]*5 + sourn[6]*10

    if gandalf_score > sourn_score:
        print(f"Battle {i}: Good triumphs over Evil")
    elif gandalf_score < sourn_score:
        print(f"Battle {i}: Evil eradicates all trace of Good")
    else:
        print(f"Battle {i}: No victor on this battle field")