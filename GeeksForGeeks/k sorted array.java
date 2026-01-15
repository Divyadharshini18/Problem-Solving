// User function Template for Java
import java.util.*;
class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
            pq.add(arr[i]);
        }
        int i=0;
        while(!pq.isEmpty()){
            int val=pq.poll();
            if(Math.abs(i-hm.get(val))>k)
                return "No";
            i++;
        }
        return "Yes";
    }
}