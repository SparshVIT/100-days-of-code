# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        temp = l1
        s1 = ""
        while temp is not None:
            s1 = s1+str(temp.val)
            temp = temp.next
        temp=l2
        s2 =""
        while temp is not None:
            s2 = s2+str(temp.val)
            temp = temp.next
        sum = int(s1)+int(s2)
        s = str(sum)
        head = ListNode(0)
        temp1 = None
        m = 0
        for i in range(0,len(s)):
            i1 = int(s[i])
            if(m==0):
                head.val = i1
                temp1 = head
                m = m+1
            else:
                temp2 = ListNode(i1)
                temp1.next = temp2
                temp1 = temp2
        if(temp1 is not None):
            temp1.next = None
        return head;
s = Solution()