class Solution {
    public int reverse(int x) {
        long ans=0;
        int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        int sign=x<0?-1:1;
        x=x*sign;
        while(x>0){
            ans=ans*10+(x%10);
            x/=10;
            if(ans>max)
                return 0;
        }
        ans*=sign;
        if(ans<min || ans>max)
            return 0;
        return (int)ans;
    }
}