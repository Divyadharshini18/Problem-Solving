class Solution {
    public int maxArea(int[] height) {
        int max=0,sum=0,i=0,j=height.length-1;
        while(i<j)
        {
            sum=0;
            int diff=j-i;
            int w=height[i]>height[j]?height[j]:height[i];
            sum=diff*w;
            if(sum>max)
                max=sum;
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
        return max;
    }
}