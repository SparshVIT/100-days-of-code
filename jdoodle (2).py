class Solution(object):
    def factorial(n):
        if(n<=1):
            return 1
        return n*factorial(n-1)
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """
        fac = factorial(n)
        s = str(fac)
        count = 0
        i = len(s)-1
        while(s[i]=='0'):
            count = count+1
            i = i-1
        return count