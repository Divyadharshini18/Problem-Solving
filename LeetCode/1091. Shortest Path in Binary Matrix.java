import java.util.*;
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        if(grid[0][0]!=0)
            return -1;
        Queue<int[]> q=new LinkedList<>();
        int[][] m={
            {0,1},
            {1,0},
            {-1,0},
            {0,-1},
            {1,1},
            {-1,-1},
            {-1,1},
            {1,-1}
        };
        q.add(new int[]{0,0,1});
        while(!q.isEmpty()){
            int[] v=q.poll();
            if(v[0]==r-1 && v[1]==c-1)
                return v[2];
            for(int i=0;i<8;i++){
                int x=v[0]+m[i][0];
                int y=v[1]+m[i][1];
                if(x>=0 && y>=0 && x<r && y<c && grid[x][y]==0){
                    q.add(new int[]{x,y,v[2]+1});
                    grid[x][y]=-1;
                }
            }
        }
        return -1;
    }
}