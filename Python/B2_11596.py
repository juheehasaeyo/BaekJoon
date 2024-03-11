# 11596 Triangle
arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
arr1.sort()
arr2.sort()
if (arr1[0]**2 + arr1[1]**2 == arr1[2]**2) and (arr2[0]**2 + arr2[1]**2 == arr2[2]**2)\
        and arr1[0]==arr2[0] and arr1[1]==arr2[1] and arr1[2]==arr2[2]:
    print("YES")
else:
    print("NO")