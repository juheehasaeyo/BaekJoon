# 28290 안밖? 밖안? 계단? 역계단?
s = input()
if s == "fdsajkl;" or s == "jkl;fdsa":
    print("in-out")
elif s == "asdf;lkj" or s == ";lkjasdf":
    print("out-in")
elif s == "asdfjkl;":
    print("stairs")
elif s == ";lkjfdsa":
    print("reverse")
else:
    print("molu")