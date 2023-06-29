class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s = set(nums)
        l = list(s)
        l.sort()
        if(len(l)>=3):
            return l[len(l)-3]
        return l[len(l)-1]
