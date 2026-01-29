import java.util.HashSet;
class Solution {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] nums) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        for(int n:nums)
            hs.add(n);
        int max=0;
        for(int i=0;i<nums.length;i++){
            int c=1,x=nums[i];
            while(hs.contains(x+1)){
                c++;
                x++;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}