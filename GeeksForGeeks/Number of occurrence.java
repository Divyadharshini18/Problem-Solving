class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int ind[]=searchRange(arr,target);
        if(ind[0]==-1 || ind[1]==-1)
            return 0;
        return ind[1]-ind[0]+1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target)
                arr[0]=m;
            if(nums[m]>=target)
                r=m-1;
            else
                l=m+1;
        }
        l=0;
        r=nums.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target)
                arr[1]=m;
            if(nums[m]>target)
                r=m-1;
            else
                l=m+1;
        }
        return arr;
    }
}