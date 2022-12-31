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
        while(temp):
            s1 = s1+str(temp.val)
            temp = temp.next
        temp = l2
        s2 = ""
        while(temp):
            s2 = s2+str(temp.val)
            temp = temp.next
        s1 = s1[::-1]
        s2 = s2[::-1]
        n1 = int(s1)
        n2 = int(s2)
        add = n1+n2
        addstr = str(add)
        addstr = addstr[::-1]
        l3 = ListNode(int(addstr[0]))
        temp = l3
        for i in range(1,len(addstr)):
            t1 = ListNode(int(addstr[i]))
            temp.next = t1
            temp = t1
        return l3
s = Solution();