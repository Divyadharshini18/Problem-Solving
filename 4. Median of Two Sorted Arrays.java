import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;
        int[] nums3=new int[n+m];
        for(int i=0;i<n;i++)
            nums3[i]=nums1[i];
        int i=0;
        for(int j=n;j<n+m;j++)
        {
            nums3[j]=nums2[i];
            i++;
        }
        Arrays.sort(nums3);
        float sum=0;
        if((n+m)%2==0)
        {
            sum+=nums3[(n+m)/2]+nums3[(n+m)/2-1];
            sum/=2;
        }
        else
        {
            sum+=nums3[(n+m)/2];
        }
        return sum;
    }
}