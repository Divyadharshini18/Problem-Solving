// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int cou=(int)Math.floor(Math.log10(n)+1);
        int temp=n,r=0;
        while(temp>0){
            r+=Math.pow(temp%10,cou);
            temp/=10;
        }
        return r==n;
    }
}