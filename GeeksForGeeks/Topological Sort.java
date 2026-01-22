import java.util.*;
class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] ind=new int[V];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int[] ed:edges){
            adj.get(ed[0]).add(ed[1]);
            ind[ed[1]]++;
        }
        bfs(adj,ind,res);
        return res;
    }
    
    public void bfs(ArrayList<ArrayList<Integer>> adj, int[] ind, ArrayList<Integer> res){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<ind.length;i++)
            if(ind[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int v=q.poll();
            res.add(v);
            for(int x:adj.get(v)){
                ind[x]--;
                if(ind[x]==0)
                    q.add(x);
            }
        }
    }
}