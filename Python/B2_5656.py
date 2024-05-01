# 5656 비교 연산자
idx = 1
while True:
    a, operator, b = map(str, input().split())
    a = int(a)
    b = int(b)
    if operator == 'E':
        break
    if operator == '>':
        if a > b:
            print(f"Case {idx}: true")
        else:
            print(f"Case {idx}: false")
        idx += 1
    if operator == '>=':
        if a >= b:
            print(f"Case {idx}: true")
        else:
            print(f"Case {idx}: false")
        idx += 1
    if operator == '<':
        if a < b:
            print(f"Case {idx}: true")
        else:
            print(f"Case {idx}: false")
        idx += 1
    if operator == '<=':
        if a <= b:
            print(f"Case {idx}: true")
        else:
            print(f"Case {idx}: false")
        idx += 1
    if operator == '==':
        if a == b:
            print(f"Case {idx}: true")
        else:
            print(f"Case {idx}: false")
        idx += 1
    if operator == '!=':
        if a != b:
            print(f"Case {idx}: true")
        else:
            print(f"Case {idx}: false")
        idx += 1