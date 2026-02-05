class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        ArrayList <ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        int[] vis=new int[V];
        for(int[] e:edges){
            adj.get(e[0]).add(new int[]{e[2],e[1]});
            adj.get(e[1]).add(new int[]{e[2],e[0]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,-1});
        int sum=0;
        while(!pq.isEmpty()){
            int[] v=pq.poll();
            if(vis[v[1]]==1)
                continue;
            vis[v[1]]=1;
            sum+=v[0];
            for(int[] a:adj.get(v[1])){
                pq.add(new int[]{a[0],a[1],v[1]});
            }
        }
        return sum;
    }
}