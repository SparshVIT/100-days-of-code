class Solution(object):
    def checkStraightLine(self, coordinates):
        """
        :type coordinates: List[List[int]]
        :rtype: bool
        """
        y = coordinates[1][1]-coordinates[0][1]
        x = coordinates[1][0]-coordinates[0][0]
        slope = 0
        if(x==0):
            slope = 23451
        else:
            slope = round(y/x)
        for i in range(2,len(coordinates)):
            y1 = coordinates[i][1]-coordinates[i-1][1]
            x1 = coordinates[i][0]-coordinates[i-1][0]
            s = 0
            if(x1==0):
                s = 23451
            else:
                s = round(y1/x1)
            if(s!=slope):
                return False
        return True
