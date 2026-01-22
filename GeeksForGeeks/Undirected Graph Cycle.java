import java.util.*;
class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i] && dfs(adj,vis,i,-1))
                return true;
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int v,int p){
        vis[v]=true;
        for(Integer n:adj.get(v)){
            if(!vis[n]){
                if(dfs(adj,vis,n,v))
                    return true;
            }
            else if(n!=p)
                    return true;
        }
        return false;
    }
}