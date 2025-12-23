import java.util.*;
class Solution {
    public int[] sortArray(int[] nums) {
        MS(nums,0,nums.length-1);
        return nums;
    }
    public void MS(int[] nums,int l,int r){
        if(l==r)
            return;
        int m=(l+r)/2;
        MS(nums,l,m);
        MS(nums,m+1,r);
        merge(nums,l,m,r);
    }
    public static void merge(int[] nums,int l,int m,int r){
        int i=l,j=m+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }
            if(nums[j]<=nums[i]){
                temp.add(nums[j]);
                j++;
            }
        }
        while(i<=m){
            temp.add(nums[i]);
            i++;
        }
        while(j<=r){
            temp.add(nums[j]);
            j++;
        }
        for(int k=l;k<=r;k++)
            nums[k]=temp.get(k-l);
    }
}