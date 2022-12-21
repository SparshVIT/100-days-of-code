def isValid(s):
    #code here
    lst = s.split(".")
    if(len(lst)!=4):
        return False
    if(len(lst)==0):
        return False
    s = ''
    for i in lst:
        s= s+i
    check = 0
    for i in s:
        if('0'<=i and i<='9'):
            check = check+1
    if(check!=len(s)):
        return False
    
    for i in lst:
        if(len(i)==0):
            return False
        if(i[0]=='0' and len(i)!=1):
            return False
        if(int(i)<0 or int(i)>255):
            return False
    return True
print(isValid("222.111.111.111"))
