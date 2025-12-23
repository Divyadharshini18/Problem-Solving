import java.util.*;
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[][] vis=new int[n][m];
        int[][] res=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    vis[i][j]=1;
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
            int i=x[0],j=x[1],d=x[2];
            res[i][j]=d;
            for(int[] in : ind){
                int a=i+in[0];
                int b=j+in[1];
                if(a>=0 && b>=0 && a<n && b<m && vis[a][b]==0){
                    q.add(new int[]{a,b,d+1});
                    vis[a][b]=1;
                }
            }
        }
        return res;
    }
}