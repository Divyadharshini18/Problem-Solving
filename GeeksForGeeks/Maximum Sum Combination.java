import java.util.*;
class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((p,q)->q[0]-p[0]);
        pq.add(new int[]{a[n-1]+b[n-1],n-1,n-1});
        HashSet<String> vis=new HashSet<>();
        vis.add((n-1)+","+(n-1));
        ArrayList<Integer> ans=new ArrayList<>();
        while(k-->0 && !pq.isEmpty()){
            int[] arr=pq.poll();
            int sum=arr[0];
            int i=arr[1];
            int j=arr[2];
            ans.add(sum);
            if(i-1>=0)
            {
                String check=(i-1)+","+j;
                if(!vis.contains(check)){
                    pq.add(new int[]{a[i-1]+b[j],i-1,j});
                    vis.add(check);
                }
            }
            if(j-1>=0){
                String check=i+","+(j-1);
                if(!vis.contains(check)){
                    pq.add(new int[]{a[i]+b[j-1],i,j-1});
                    vis.add(check);
                }
            }
        }
        return ans;
    }
}