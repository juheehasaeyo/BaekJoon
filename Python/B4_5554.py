# 5554 심부름 가는 길
home = int(input())
pc = int(input())
academy = int(input())
comebackhome = int(input())
sum_second = home + pc + academy + comebackhome
x = sum_second // 60
y = sum_second % 60

print(x)
print(y)