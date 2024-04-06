# 4659 비밀번호 발음하기
arr = 'aeiou'
while True:
    pwd = input()
    if pwd == "end":
        break

    acceptable = True
    cnt = 0
    # 1번 조건: 모음(a,e,i,o,u) 하나를 반드시 포함
    for char in pwd:
        if char in arr:
            cnt += 1
            break
    if cnt < 1:
        acceptable = False

    #2번 조건: 모음이 3개 혹은 자음이 3개 연속으로 오면 안됨
    for i in range(len(pwd)-2):
        if pwd[i] in arr and pwd[i+1] in arr and pwd[i+2] in arr:
            acceptable = False
            break
        if pwd[i] not in arr and pwd[i+1] not in arr and pwd[i+2] not in arr:
            acceptable = False
            break

    # 3번 조건: 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용
    for i in range(len(pwd)-1):
        if pwd[i] == pwd[i+1] and pwd[i] != 'e' and pwd[i] != 'o':
            acceptable = False
            break

    if acceptable:
        print("<" + pwd + "> is acceptable.")
    else:
        print("<" + pwd + "> is not acceptable.")