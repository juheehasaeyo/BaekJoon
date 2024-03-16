# 4597 패리티
while True:
    str = input()
    if str == "#":
        break
    # 1의 개수 세기
    cnt = str.count("1")
    if str.strip()[-1] == "e" and cnt%2 == 1:
        str = str[:-1] + "1"
    elif str.strip()[-1] == "e" and cnt%2 == 0:
        str = str[:-1] + "0"
    if str.strip()[-1] == "o" and cnt % 2 == 1:
        str = str[:-1] + "0"
    elif str.strip()[-1] == "o" and cnt % 2 == 0:
        str = str[:-1] + "1"

    print(str)