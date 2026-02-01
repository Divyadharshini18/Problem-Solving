class Solution {
    public boolean isTrionic(int[] nums) {
        boolean f1=false,f2=false,f3=false;
        int n=nums.length,i=0;
        while(i<n-1 && nums[i]<nums[i+1]){
            f1=true;
            i++;
        }
        while(i<n-1 && nums[i]>nums[i+1]){
            f2=true;
            i++;
        }
        while(i<n-1 && nums[i]<nums[i+1]){
            f3=true;
            i++;
        }
        return f1 && f2 && f3 && i==n-1;
    }
}