import java.util.*;
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[0]).add(new int[] {e[1],e[2]});
            adj.get(e[1]).add(new int[] {e[0],e[2]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        pq.add(new int[]{src,0});
        dist[src]=0;
        while(!pq.isEmpty()){
            int[] v=pq.poll();
            int no=v[0];
            int d=v[1];
            if(d>dist[no])
                continue;
            for(int[] ver:adj.get(no)){
                int ne=ver[0];
                int wt=ver[1];
                if(dist[no]+wt<dist[ne]){
                    dist[ne]=dist[no]+wt;
                    pq.add(new int[]{ne,dist[ne]});
                }
            }
        }
        return dist;
    }
}