import java.util.*;
class Solution {
    public int minCostPath(int[][] mat) {
        // code here
        int r=mat.length,c=mat[0].length;
        int[][] diff=new int[r][c];
        for(int i=0;i<r;i++)
            Arrays.fill(diff[i],Integer.MAX_VALUE);
        diff[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,0});
        int[][] m={
            {-1,0},
            {0,-1},
            {1,0},
            {0,1}
        };
        while(!pq.isEmpty()){
            int[] v=pq.poll();
            for(int i=0;i<4;i++){
                int x=v[1]+m[i][0];
                int y=v[2]+m[i][1];
                if(x>=0 && y>=0 && x<r && y<c){
                    int nd=Math.max(Math.abs(mat[x][y]-mat[v[1]][v[2]]),v[0]);
                    if(nd<diff[x][y]){
                        diff[x][y]=nd;
                        pq.add(new int[]{nd,x,y});
                    }
                }
            }
        }
        return diff[r-1][c-1];
    }
}
