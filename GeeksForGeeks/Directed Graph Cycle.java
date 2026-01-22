import java.util.*;
class Solution {
    public void bfs(ArrayList<ArrayList<Integer>> adj,int[] ind,int V){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
            if(ind[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int v=q.poll();
            for(Integer x:adj.get(v)){
                ind[x]--;
                if(ind[x]==0)
                    q.add(x);
            }
        }
    }
    
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        int[] ind=new int[V];
        for(int[] ed:edges){
            adj.get(ed[0]).add(ed[1]);
            ind[ed[1]]++;
        }
        bfs(adj,ind,V);
        for(int i=0;i<V;i++)
            if(ind[i]>0)
                return true;
        return false;
    }
}