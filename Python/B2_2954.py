# 2954 창영이의 일기장
# 양쪽 공백 제거
sentence = list(input().strip())
lst = ['a', 'e', 'i', 'o', 'u']
real_sentence = []
i = 0
while i < len(sentence):
    real_sentence.append(sentence[i])
    if sentence[i] in lst:
        # 'p'와 반복된 모음 건너뛰기
        i += 2
    # 다음 문자로 이동
    i += 1
# 리스트에 저장된 문자열 합치기
print(''.join(real_sentence))