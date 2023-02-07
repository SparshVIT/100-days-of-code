class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        intervals.sort(key = lambda x: x[1])
        l1 = []
        l1.append(intervals[0][0])
        l1.append(intervals[0][1])
        count  = 0;
        for i in range(1,len(intervals)):
            if(l1[1]>intervals[i][0]):
                count = count+1
            else:
                l1[0] = intervals[i][0]
                l1[1] = intervals[i][1]
        return count
