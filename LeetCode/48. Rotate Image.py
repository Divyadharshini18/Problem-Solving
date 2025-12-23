class Solution(object):
    def rotate(self, mat):
        n=len(mat)
        m=len(mat[0])
        for i in range(n):
            for j in range(i,m):
                t=mat[i][j]
                mat[i][j]=mat[j][i]
                mat[j][i]=t
        for i in range(n):
            k=0
            l=m-1
            while k<l:
                t=mat[i][l]
                mat[i][l]=mat[i][k]
                mat[i][k]=t
                k+=1
                l-=1
                