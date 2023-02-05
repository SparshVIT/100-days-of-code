class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        lst = s.split(" ")
        for i in range(0,len(lst)):
            lst[i] = lst[i][-1::-1]
        s1 = ""
        for i in range(0,len(lst)):
            if(i==len(lst)-1):
                s1 = s1+lst[i]
            else:
                s1 = s1+lst[i]
                s1 = s1+" "
        return s1
