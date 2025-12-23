class Solution {
    public String longestPalindrome(String s) {
        int n=s.length(),max=1,st=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j) && (j-i+1)>max){
                    st=i;
                    max=j-i+1;
                }
            }
        }
        return s.substring(st,st+max);
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}