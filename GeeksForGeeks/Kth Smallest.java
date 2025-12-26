import java.util.*;
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a:arr)
            pq.add(a);
        for(int i=1;i<k;i++)
            pq.poll();
        return pq.peek();
    }
}