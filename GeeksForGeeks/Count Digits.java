class Solution {
    static int evenlyDivides(int n) {
        // code here
        int c=0,temp=n;
        while(n>0){
            int t=n%10;
            if(t!=0 && temp%t==0)
                c++;
            n/=10;
        }
        return c;
    }
}