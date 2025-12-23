import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(target-nums[i]))
                return new int[] {i,hm.get(target-nums[i])};
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}