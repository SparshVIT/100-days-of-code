class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        s = ""
        for i in range(0,len(num)):
            s = s+str(num[i])
        j = int(s)
        j = j+k
        s = str(j)
        num = []
        for i in range(0,len(s)):
            num.append(int(s[i]))
        return num
