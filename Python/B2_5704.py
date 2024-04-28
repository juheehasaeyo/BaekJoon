# 5704 팬그램
while True:
    str = input()
    pangram = 'Y'
    if str == "*":
        break
    else:
        # 알파벳 소문자 a에서 z까지
        for alphabet in range(97, 123):
            # str에 모든 알파벳 소문자가 없으면
            if str.find(chr(alphabet)) == -1:
                pangram = 'N'
                break
    print(pangram)