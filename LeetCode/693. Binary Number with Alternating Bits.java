class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=n%2;
        n/=2;
        int curr=-1;
        while(n>0){
            curr=n%2;
            n/=2;
            if(curr==prev)
                return false;
            prev=curr;
        }
        return true;
    }
}