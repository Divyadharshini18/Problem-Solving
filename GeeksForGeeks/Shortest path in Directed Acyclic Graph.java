// User function Template for Java
import java.util.*;
class Solution {
    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        int[] indeg=new int[V];
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
            indeg[e[1]]++;
        }
            
        Queue<Integer> q=new LinkedList<>();
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        for(int i=0;i<V;i++)
            if(indeg[i]==0)
                q.add(i);
        dist[0]=0;
        while(!q.isEmpty()){
            int v=q.poll();
            if(dist[v]!=Integer.MAX_VALUE)
                for(int[] ver:adj.get(v))
                    dist[ver[0]]=Math.min(dist[ver[0]],dist[v]+ver[1]);
            for(int[] ver:adj.get(v)){
                indeg[ver[0]]--;
                if(indeg[ver[0]]==0)
                    q.add(ver[0]);
            }
        }
        for(int i=0;i<V;i++)
            if(dist[i]==Integer.MAX_VALUE)
                dist[i]=-1;
        return dist;
    }
}