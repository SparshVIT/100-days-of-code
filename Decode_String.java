class Solution(object):
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        lst = []
        lst_operation = []
        string_operation = ''
        for i in range(0,len(s)):
            c = s[i]
            if('0'<=c and c<='9'):
                string_operation = string_operation+c
            elif(c=='['):
                lst_operation.append(int(string_operation))
                lst.append(c)
                string_operation = ''
            elif('a'<=c and c<='z'):
                lst.append(c)
            elif(c==']'):
                index = -1
                st1 = ''
                for j in range(len(lst)-1,-1,-1):
                    if(lst[j]=='['):
                        index = j
                        break
                for j in range(index+1,len(lst)):
                    st1 = st1+lst[j]
                count = lst_operation[-1]
                st1 = st1*count
                lst1 = []
                for j in range(0,index):
                    lst1.append(lst[j])
                lst1.append(st1)
                lst = lst1
                lst_operation.pop()
        result = ''
        for i in range(0,len(lst)):
            result = result+lst[i]
        return result


