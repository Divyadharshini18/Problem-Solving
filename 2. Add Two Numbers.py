# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Linkedlist:
    def __init__(self):
        self.headNode=self.lastNode=None
        self.length=0
    def isEmpty(self):
        return self.headNode==None
    def addNode(self,val):
        nd=ListNode(val)
        if self.isEmpty():
            self.headNode=self.lastNode=nd
        else:
            self.lastNode.next=nd
            self.lastNode=nd
        self.length+=1
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        l3=Linkedlist()
        curr1,curr2=l1,l2
        carry=0
        while curr1!=None and curr2!=None:
            x=curr1.val+curr2.val+carry
            l3.addNode(x%10)
            carry=x//10
            curr1=curr1.next
            curr2=curr2.next
        while curr1!=None:
            x=curr1.val+carry
            l3.addNode(x%10)
            carry=x//10
            curr1=curr1.next
        while curr2!=None:
            x=curr2.val+carry
            l3.addNode(x%10)
            carry=x//10
            curr2=curr2.next
        if carry!=0:
            l3.addNode(carry)
        return l3.headNode