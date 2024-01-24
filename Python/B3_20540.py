# 20540 연길이의 이상형
mbti = input()
arr = []
for i in range(len(mbti)):
    if(mbti[0] == "E"):
        arr.append("I")
    else:
        arr.append("E")
    if (mbti[1] == "S"):
        arr.append("N")
    else:
        arr.append("S")
    if (mbti[2] == "F"):
        arr.append("T")
    else:
        arr.append("F")
    if (mbti[3] == "J"):
        arr.append("P")
    else:
        arr.append("J")
result = "".join(arr[:4])  # 처음 네 글자만 선택
print(result)