#User function Template for python3
class Solution:
    def precedence(ch):
        if ch=='^' :
            return 4
        elif ch=='+' or ch=='-':
            return 2
        elif ch=='*' or ch=='/':
            return 3
        else:
            return 1
    #Function to convert an infix expression to a postfix expression.
    def InfixtoPostfix(self, exp):
        postfix=""
        stack=[]
        for ch in exp:
            if not(ch=='(' or ch==')' or ch=='+' or ch=='-' or ch=='*' or ch=='/' or ch=='^'):
                postfix = postfix+ch
            else:
                if ch=='(':
                    stack.append(ch)
                elif ch==')':
                    while (stack[-1]!='('):
                        postfix=postfix+ stack.pop()
                    stack.pop()
                else:
                    while len(stack)>0 and Solution.precedence(ch)<=Solution.precedence(stack[-1]):
                        postfix=postfix+stack.pop()
                    stack.append(ch)
        while len(stack)!=0:
            postfix=postfix + stack.pop()
        return postfix