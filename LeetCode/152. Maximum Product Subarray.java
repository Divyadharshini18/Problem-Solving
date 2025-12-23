class Solution {
    public int maxProduct(int[] nums) {
        int p=1,s=1,max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            p*=nums[i];
            s*=nums[n-i-1];
            max=Math.max(max,Math.max(s,p));
            if(p==0)
                p=1;
            if(s==0)
                s=1;
        }
        return max;
    }
}