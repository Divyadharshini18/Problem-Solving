import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums)
            hm.put(n,hm.getOrDefault(n,0)+1);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer> f:hm.entrySet()){
            pq.add(new int[]{f.getKey(),f.getValue()});
            if(pq.size()>k)
                pq.poll();
        }
        int[] ans=new int[k];
        int i=0;
        while(!pq.isEmpty())
            ans[i++]=pq.poll()[0];
        return ans; 
    }
}