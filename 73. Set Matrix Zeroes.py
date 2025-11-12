class Solution(object):
    def setZeroes(self, mat):
        n=len(mat)
        m=len(mat[0])
        q=[]
        col=[0]*m
        row=[0]*n
        for i in range(n):
          for j in range(m):
            if mat[i][j]==0:
              q.append((i,j))
        while q:
          r,c=q.pop()
          if row[r]==0:
            for j in range(m):
              mat[r][j]=0
            row[r]=-1
          if col[c]==0:
            for i in range(n):
              mat[i][c]=0
            col[c]=-1
        return mat