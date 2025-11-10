class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0,k=0;
        while(k<n){
            if(nums[k]!=0)
                nums[i++]=nums[k];
            k++;
        }
        while(i<n)
            nums[i++]=0;
    }
}