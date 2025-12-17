import java.util.*;
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int f=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    f++;
                else if(grid[i][j]==2)
                    q.add(new int[]{i,j,0});
            }
        }
        int max=0;
        int[][] ind={
            {-1,0},
            {0,-1},
            {0,1},
            {1,0}
        };
        while(!q.isEmpty()){
            int[] o=q.poll();
            int row=o[0],col=o[1],t=o[2];
            max=t;
            for(int[] i:ind){
                int x=row+i[0];
                int y=col+i[1];
                if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]==1){
                    q.add(new int[]{x,y,t+1});
                    grid[x][y]=2;
                    f-=1;
                }
            }
        }
        return f==0?max:-1;
    }
}