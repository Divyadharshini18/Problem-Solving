import java.util.*;
class Solution {
    int x=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int V=numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] res = new int[V];
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        int[] ind=new int[V];
        for(int[] ed:prerequisites){
            adj.get(ed[1]).add(ed[0]);
            ind[ed[0]]++;
        }
        bfs(adj,ind,V,res);
        if(x!=V)
            return new int[]{};
        return res;
    }
    public void bfs(ArrayList<ArrayList<Integer>> adj,int[] ind,int V,int[] res){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
            if(ind[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int v=q.poll();
            res[x]=v;
            x++;
            for(Integer x:adj.get(v)){
                ind[x]--;
                if(ind[x]==0)
                    q.add(x);
            }
        }
    }
}