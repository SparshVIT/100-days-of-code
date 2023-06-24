class Solution:
    def klengthpref(self,arr,n,k,s):
        # return list of words(str) found in the board
        lst = list(s)
        lst = lst[0:k]
        if(k>len(lst)):
            return 0
        count = 0
        for i in range(0,len(arr)):
            lst1 = list(arr[i])
            lst1 = lst1[0:k]
            if(lst1==lst):
                count = count+1
        return count
