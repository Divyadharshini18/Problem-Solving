from collections import deque
class Solution:
    #Function to find distance of nearest 1 in the grid for each cell.
    def nearest(self, grid):
        n=len(grid)
        m=len(grid[0])
        ans = [[float('inf')] * m for _ in range(n)]
        q=deque()
        for i in range(n):
            for j in range(m):
                if grid[i][j]==1:
                    ans[i][j]=0
                    q.append((i,j,0))
        while q:
            a,b,c=q.popleft()
            poi=[[0,1],[0,-1],[1,0],[-1,0]]
            for k in range(4):
                x=a+poi[k][0]
                y=b+poi[k][1]
                if x>=0 and y>=0 and x<n and y<m and ans[x][y]==float('inf'):
                    ans[x][y]=c+1
                    q.append((x,y,c+1))
        return ans