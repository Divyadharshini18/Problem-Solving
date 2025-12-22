import java.util.*;
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        // int[][] vis=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==1){
                        q.add(new int[]{i,j});
                        grid[i][j]=0;
                    }
                }
            }
            else{
                if(grid[i][0]==1){
                    q.add(new int[]{i,0});
                    grid[i][0]=0;
                }
                if(grid[i][m-1]==1){
                    q.add(new int[]{i,m-1});
                    grid[i][m-1]=0;
                }
            }
        }
        int[][] ind={
            {-1,0},
            {0,-1},
            {1,0},
            {0,1}
        };
        while(!q.isEmpty()){
            int[] x=q.poll();
            int i=x[0],j=x[1];
            for(int[] in:ind){
                int a=i+in[0];
                int b=j+in[1];
                if(a>=0 && b>=0 && a<n && b<m && grid[a][b]==1){
                    grid[a][b]=0;
                    q.add(new int[]{a,b});
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(grid[i][j]==1)
                    c++;
        return c;
    }
}