import java.util.*;
class Solution {
    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int r=grid.length,c=grid[0].length;
        if(source[0]==destination[0] && source[1]==destination[1])
            return 0;
        int[][] dist=new int[r][c];
        for(int i=0;i<r;i++)
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        dist[source[0]][source[1]]=0;
        Queue<int[]> q =new LinkedList<>();
        q.add(new int[]{source[0],source[1],0});
        int[][] m={
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        while(!q.isEmpty()){
            int[] v=q.poll();
            if(v[0]==destination[0] && v[1]==destination[1])
                return v[2];
            for(int i=0;i<4;i++){
                int x=v[0]+m[i][0];
                int y=v[1]+m[i][1];
                if(x>=0 && y>=0 && x<r && y<c && grid[x][y]==1 && dist[x][y]==Integer.MAX_VALUE){
                    q.add(new int[]{x,y,v[2]+1});
                    dist[x][y]=v[2]+1;
                }
            }
        }
        return -1;
    }
}