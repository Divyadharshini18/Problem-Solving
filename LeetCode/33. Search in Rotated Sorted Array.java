class Solution {
    public int search(int[] nums, int target) {
        int mid=-1;
        for(int i=0;i<nums.length-1 && mid==-1;i++)
            if(nums[i]>nums[i+1])
                mid=i+1;
        if(mid==-1)
            return bin(nums,0,nums.length-1,target);
        int h1=bin(nums,0,mid-1,target);
        int h2=bin(nums,mid,nums.length-1,target);
        if(h1==-1 && h2==-1)
            return -1;
        return h1==-1?h2:h1;
    }
    public int bin(int[] nums,int s,int e,int t){
        if(s>e)
            return -1;
        int mid=(s+e)/2;
        if(nums[mid]==t)
            return mid;
        if(nums[mid]>t)
            return bin(nums,s,mid-1,t);
        return bin(nums,mid+1,e,t);
    }
}