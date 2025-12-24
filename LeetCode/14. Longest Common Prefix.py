class Solution:
    def longestCommonPrefix(self, strs):
        n=len(strs)
        m=len(strs[0])
        s=''
        for i in range(m):
            c=1
            for j in range(1,n):
                if i<len(strs[j]) and strs[0][i]==strs[j][i]:
                    c+=1
                else:
                    break
            if c==n:
                s+=strs[0][i]
            else:
                break
        return s