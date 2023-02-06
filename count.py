class Solution(object):
    def countDistinctIntegers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        lst = []
        for i in range(0,len(nums)):
            nums[i] = str(nums[i])
            lst.append(nums[i][-1::-1])
        for i in range(0,len(nums)):
            nums[i] = int(nums[i])
            lst[i] = int(lst[i])
        nums = nums+lst
        return len(set(nums))
