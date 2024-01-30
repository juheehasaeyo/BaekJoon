# 7600 문자가 몇갤까
while True:
    str = input().lower()
    if str == "#":
        break
    arr = [0] * 26
    for i in range(0, len(str)):
        ch = str[i]
        if ch.isalpha():
            # 문자를 아스키코드로 변환 == 자바의 charAt()
            index = ord(ch) - ord('a')
            arr[index] += 1

    cnt = 0
    for i in range(0,26):
        if arr[i] > 0:
            cnt += 1

    print(cnt)