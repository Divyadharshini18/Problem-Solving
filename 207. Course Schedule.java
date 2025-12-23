import java.util.*;
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V=numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        int[] ind=new int[V];
        for(int[] ed:prerequisites){
            adj.get(ed[1]).add(ed[0]);
            ind[ed[0]]++;
        }
        bfs(adj,ind,V);
        for(int i=0;i<V;i++)
            if(ind[i]>0)
                return false;
        return true;
    }
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
}