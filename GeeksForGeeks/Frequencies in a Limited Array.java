import java.util.*;
class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
            res.add(0);
        for(int i=0;i<n;i++)
            res.set(arr[i]-1,res.get(arr[i]-1)+1);
        return res;
    }
}