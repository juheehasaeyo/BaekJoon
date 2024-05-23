# 1864 문어 숫자
arr = {'-': 0, '\\': 1, '(': 2, '@': 3, '?': 4, '>': 5, '&': 6, '%': 7, '/': -1}
while True:
    str = input()
    if str == "#":
        break
    res = 0
    for i in range(len(str)):
        res += arr[str[i]] * 8 ** (len(str) - i - 1)
    print(res)