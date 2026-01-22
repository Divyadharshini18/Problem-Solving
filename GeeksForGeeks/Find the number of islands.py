class Solution:
    def numIslands(self, grid):
        # code here
        n=len(grid)
        m=len(grid[0])
        vis=[[0]*m for _ in range(n)]
        poi=[[0,1],[1,0],[-1,0],[0,-1],[1,1],[-1,-1],[1,-1],[-1,1]]
        c=0
        for i in range(n):
            for j in range(m):
                if grid[i][j]=='L' and not vis[i][j]:
                    st=[(i,j)]
                    vis[i][j]=1
                    while st:
                        k,l=st.pop()
                        for z in range(8):
                            a=k+poi[z][0]
                            b=l+poi[z][1]
                            if a>=0 and b>=0 and a<n and b<m and grid[a][b]=='L' and not vis[a][b]:
                                vis[a][b]=1
                                st.append((a,b))
                    c+=1
        return c