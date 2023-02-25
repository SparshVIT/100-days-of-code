class Solution(object):
    def findMinArrowShots(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        points.sort()
        newIntervals = []
        np = []
        newIntervals.append(points[0][0])
        newIntervals.append(points[0][1])
        for i in range(1,len(points)):
            if(len(newIntervals)==0):
                newIntervals = points[i]
                continue
            if(newIntervals[1]<points[i][0]):
                np.append(points[i])
                newIntervals = points[i]
            else:
                newIntervals[0] = min(points[i][0], newIntervals[0])
                newIntervals[1] = min(points[i][1], newIntervals[1])
        if(len(newIntervals)!=0):
            np.append(newIntervals)
        return len(np)

