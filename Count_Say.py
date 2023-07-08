class Solution(object):
    def cs(self,st):
        s = ''
        i = 0
        while(i<len(st)):
            c = st[i]
            count = 1
            j = i+1
            while(j<len(st) and st[j]==c):
                count = count+1
                j = j+1
            i = i+count
            s = s+str(count)+c
        return s
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        s = '1'
        for i in range(2,n+1):
            print(s)
            s = self.cs(s)
        return s
