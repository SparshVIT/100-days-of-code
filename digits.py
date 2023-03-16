class Solution(object):
    def separateDigits(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        lst = []
        for i in range(0,len(nums)):
            lst1 = list(str(nums[i]))
            lst = lst+lst1
        for i in range(0,len(lst)):
            lst[i] = int(lst[i])
        return lst
