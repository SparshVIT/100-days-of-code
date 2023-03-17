class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """
        lst = address.split(".")
        st = ""
        for i in range(0,len(lst)):
            if(i==len(lst)-1):
                st = st+lst[i]
            else:
                st = st+lst[i]
                st = st+"[.]"
        return st
