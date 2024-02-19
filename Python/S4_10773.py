# 10773 제로
import sys
input = sys.stdin.readline

k = int(input())
stack = []

for _ in range(k):
    n = int(input())
    # 입력이 0인 경우 가장 최근에 쓴 수를 지우고
    # 0이 아닐 경우 해당 수를 쓴다
    stack.append(n) if n else stack.pop()

print(sum(stack))


# # 10773 제로
# k = int(input())
# stack = [] # 스택 리스트
# sum = 0
# for _ in range(k):
#     n = int(input())
#     if n == 0:
#         sum -= stack.pop()
#     else:
#         stack.append(n)
#         sum += n
# print(sum)


# # 10773 제로
# from collections import deque
#
# k = int(input())
# stack = deque()
# for _ in range(k):
#     n = int(input())
#     if n == 0:
#         # 덱이 비어있지 않을 때만 pop
#         stack.pop() if stack else None
#     else:
#         stack.append(n)
# print(sum(stack))