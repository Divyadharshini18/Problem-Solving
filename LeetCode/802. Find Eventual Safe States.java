import java.util.*;
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Queue<Integer> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int V=graph.length;
        int ind[]=new int[V];
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i);
                ind[i]++;
            }
        }
        for(int i=0;i<V;i++)
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
        Collections.sort(res);
        return res;
    }
}