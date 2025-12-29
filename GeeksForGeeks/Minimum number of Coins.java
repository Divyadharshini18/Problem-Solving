class Solution {
    public int findMin(int n) {
        // code here
        int ans=0;
        ans+=n/10;
        n%=10;
        ans+=n/5;
        n%=5;
        ans+=n/2;
        n%=2;
        ans+=n;
        return ans;
    }
}
