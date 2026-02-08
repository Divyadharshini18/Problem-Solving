class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0;
        int n=s.length();
        int curr=1,prev=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)==s.charAt(i))
                curr++;
            else{
                ans+=Math.min(curr,prev);
                prev=curr;
                curr=1;
            }
        }
        ans+=Math.min(prev,curr);
        return ans;
    }
}