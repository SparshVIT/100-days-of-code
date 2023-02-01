class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort()
        l = []
        newIntervals = []
        newIntervals.append(intervals[0][0])
        newIntervals.append(intervals[0][1])
        for i in range(1, len(intervals)):
            if(newIntervals[1]<intervals[i][0]):
                l.append(newIntervals);
                newIntervals = intervals[i]
            else:
                newIntervals[0] = min(intervals[i][0], newIntervals[0])
                newIntervals[1] = max(intervals[i][1], newIntervals[1])
        l.append(newIntervals)
        return l