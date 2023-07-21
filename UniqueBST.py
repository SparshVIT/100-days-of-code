class Solution(object):
     lst = []
     def cat(self,n):
        if(n==0):
            return 1
        if(n==1):
            return 1
        if(self.lst[n-1]!=-1):
            return self.lst[n-1]
        d = 0
        for i in range(0,n):
            d += self.cat(i)*self.cat((n-1)-i)
        self.lst[n-1] = d
        return d
            
     def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        for i in range(0,n):
            self.lst.append(-1)
        return self.cat(n);
