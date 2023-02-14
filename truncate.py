class Solution(object):
    def truncateSentence(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        lst = s.split(" ")
        count = 0
        s1 = ""
        i = 0
        while(count<k and i<len(lst)):
            if(count==k-1):
                s1 = s1+lst[i]
            else:
                s1 = s1+lst[i]
                s1 = s1+" "
            count = count+1
            i = i+1
        return s1
