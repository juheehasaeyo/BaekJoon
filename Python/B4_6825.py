# 6825 Body Mass Index
weight = float(input())
height = float(input())
bmi = weight / (height * height)
if bmi > 25:
    res = "Overweight"
elif 18.5 <= bmi <= 25:
    res = "Normal weight"
else:
    res = "Underweight"
print(res)