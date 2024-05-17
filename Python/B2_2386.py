# 2386 도비의 영어 공부
while True:
    line = input().strip()
    if line == "#":
        break
    alphabet = line[0]
    eng = line[2:]
    cnt = eng.lower().count(alphabet.lower())
    print(f"{alphabet} {cnt}")