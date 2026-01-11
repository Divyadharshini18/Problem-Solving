import java.util.*;
class Solution {
    ArrayList<Integer> res=new ArrayList<>();

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[adj.size()];
        dfsUtil(adj,0,vis);
        return res;
    }
    
    public void dfsUtil(ArrayList<ArrayList<Integer>> adj,int v, boolean[] vis){
        res.add(v);
        vis[v]=true;
        for(Integer a:adj.get(v))
            if(!vis[a])
                dfsUtil(adj,a,vis);
    }
}