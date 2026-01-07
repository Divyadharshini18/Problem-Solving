import java.util.*;
class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:nums)
            if(n>0)
                pq.add(n);
        int c=0;
        while(pq.size()>0){
            ArrayList<Integer> a=new ArrayList<>();
            int nu=pq.poll();
            while(pq.size()>0){
                int mu=pq.poll();
                if(mu-nu>0)
                    a.add(mu-nu);
            }
            for(int arr:a)
                pq.add(arr);
            c++;
        }
        return c;
    }
}