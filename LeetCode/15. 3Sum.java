import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int l=i+1,r=n-1;
            while(l<r){
                int s=nums[i]+nums[l]+nums[r];
                if(s==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1])
                        l++;
                    while(r>l && nums[r]==nums[r+1])
                        r--;
                }
                else if(s<0)
                    l++;
                else
                    r--;
            }
        }
        return res;
    }
}