class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int l=0,r=arr.length-1,ans=arr.length;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]>target){
                ans=m;
                r=m-1;
            }
            else
                l=m+1;
        }
        return ans;
    }
}