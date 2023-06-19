class Solution(object):
    def largestAltitude(self, gain):
        """
        :type gain: List[int]
        :rtype: int
        """
        lst = []
        lst.append(0)
        m = 0
        for i in range(0,len(gain)):
            j = lst[len(lst)-1]+gain[i]
            lst.append(j)
            m = max(j,m)
        return m
