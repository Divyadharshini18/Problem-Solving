import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        if(k>= n/2){
            PriorityQueue<Integer> pq=new PriorityQueue<>(); // if no parameter is passes act like an min heap
            for(int i=0;i<nums.length;i++)
                pq.add(nums[i]);
            for(int i=1;i<n-k+1;i++)
                pq.poll();
            return pq.peek();
        }
        else{
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); // if no parameter is passes act like an min heap
            for(int i=0;i<nums.length;i++)
                pq.add(nums[i]);
            for(int i=1;i<k;i++)
                pq.poll();
            return pq.peek();
        }
    }
}