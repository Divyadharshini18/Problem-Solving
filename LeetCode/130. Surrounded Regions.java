import java.util.*;
class Solution {
    public void solve(char[][] board) {
        int n=board.length,m=board[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int j=0;j<m;j++){
            if(board[0][j]=='O'){
                q.add(new int[]{0,j});
                board[0][j]='Y';
            }
            if(board[n-1][j]=='O'){
                q.add(new int[]{n-1,j});
                board[n-1][j]='Y';
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                q.add(new int[]{i,0});
                board[i][0]='Y';
            }
            if(board[i][m-1]=='O'){
                q.add(new int[]{i,m-1});
                board[i][m-1]='Y';
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
                if(a>=0 && b>=0 && a<n && b<m && board[a][b]=='O'){
                    q.add(new int[]{a,b});
                    board[a][b]='Y';
                }
            }
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(board[i][j]=='Y')
                    board[i][j]='O';
                else if(board[i][j]=='O')
                    board[i][j]='X';
    }
}