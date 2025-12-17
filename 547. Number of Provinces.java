import java.util.*;
class Solution {
    int p=0;
    public void bfs(int[][] isConnected,boolean[] vis,int v){
        Queue<Integer> q=new LinkedList<>();
        q.add(v);
        vis[v]=true;
        while(!q.isEmpty()){
            int x=q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[x][i]==1 && vis[i]==false){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean []vis=new boolean[isConnected.length];
        for(int v=0;v<isConnected.length;v++){
            if(!vis[v]){
                p++;
                bfs(isConnected,vis,v);
            }
        }
        return p;
    }
}