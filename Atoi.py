class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        s1 = ""
        negative = False
        lst = []
        for i in range(0,len(s)):
            if(s[i]=='-'):
                if(len(lst)!=0):
                    break
                if(len(s1)!=0):
                    break
                else:
                    negative = True
                    lst.append('-')
                    continue
            if(s[i]=='+'):
                if(len(lst)!=0):
                    break
                if(len(s1)!=0):
                    break
                else :
                    negative = False
                    lst.append('+')
                    continue
            if(s[i].isdigit()==True):
                s1 = s1+s[i]
            elif(s[i]==' '):
                if(len(s1)!=0 or len(lst)!=0):
                    break
                else:
                    continue
            elif(s[i].isdigit()==False):
                break
        value = 0
        print(s1)
        for i in range(0,len(s1)):
            a = 0
            if(s1[i]=='0'):
                a = 0
            elif(s1[i]=='1'):
                a = 1
            elif(s1[i]=='2'):
                a = 2
            elif(s1[i]=='3'):
                a = 3
            elif(s1[i]=='4'):
                a = 4
            elif(s1[i]=='5'):
                a = 5
            elif(s1[i]=='6'):
                a = 6
            elif(s1[i]=='7'):
                a = 7
            elif(s1[i]=='8'):
                a = 8
            elif(s1[i]=='9'):
                a = 9
            if(i==0):
                value = a
            else:
                value = value*10+a
        if(negative==True):
            value = value*-1
        llimit = pow(2,31)
        llimit = llimit*-1
        ulimit = pow(2,31)
        if(value<llimit):
            value = llimit
        elif(value>=ulimit):
            value = ulimit-1
        return value
