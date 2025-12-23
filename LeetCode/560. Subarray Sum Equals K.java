import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0,1);
        int s=0,c=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            int bal=s-k;
            c+=hm.getOrDefault(bal,0);
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        return c;
    }
}