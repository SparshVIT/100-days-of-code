class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        lst1 = version1.split('.')
        lst2 = version2.split('.')
        if(len(lst1)>len(lst2)):
            for i in range(0,len(lst1)-len(lst2)):
                lst2.append('0')
        elif(len(lst1)<len(lst2)):
            for i in range(0,len(lst2)-len(lst1)):
                lst1.append('0')
        result = 0
        for i in range(0,len(lst1)):
            if(int(lst1[i])<int(lst2[i])):
                result = -1
                break
            elif(int(lst1[i])>int(lst2[i])):
                result =1
                break
        return result