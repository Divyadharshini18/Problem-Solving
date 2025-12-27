import java.util.*;
class Solution {
    public static int minCost(int[] arr) {
        // code here
        if(arr.length<=1)
            return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a:arr)
            pq.add(a);
        int c=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            c+=(a+b);
            pq.add(a+b);
        }
        return c;
    }
}