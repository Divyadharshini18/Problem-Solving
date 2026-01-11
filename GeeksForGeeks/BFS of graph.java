import java.util.*;
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        int V=adj.size();
        boolean[] vis = new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int v=q.poll();
            ans.add(v);
            for(Integer x:adj.get(v)){
                if(vis[x]==false){
                    q.add(x);
                    vis[x]=true;
                }
            }
        }
        return ans;
    }
}