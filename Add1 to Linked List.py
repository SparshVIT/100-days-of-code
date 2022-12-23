#User function Template for python3

'''

class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None
'''

class Solution:
    def addOne(self,head):
        #Returns new head of linked List.
        temp = head
        s = ""
        length = 0
        while(temp):
           s = s+str(temp.data)
           temp = temp.next
           length = length+1
        a = int(s)
        a = a+1
        result = str(a)
        if(len(result)>length):
            temp = head
            i = 0
            while(temp):
                temp.data = int(result[i])
                temp = temp.next
                i = i+1
            last = Node(int(result[len(result)-1]))
            temp = head
            while(temp.next):
                temp = temp.next
            temp.next = last
        else:
            temp = head
            i=0
            while(temp):
                temp.data = int(result[i])
                temp = temp.next
                i = i+1
        return head
            
        
