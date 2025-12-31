class Solution {
    public int jump(int[] nums) {
        int curr=0,max=0,jump=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>max)
                max=i+nums[i];
            if(curr==i){
                jump++;
                curr=max;
            }
        }
        return jump;
    }
}