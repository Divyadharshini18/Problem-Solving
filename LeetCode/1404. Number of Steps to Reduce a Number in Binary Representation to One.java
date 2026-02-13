class Solution {
    public int numSteps(String s) {
        int st=0,ca=0;
        for(int i=s.length()-1;i>0;i--){
            int n=(s.charAt(i)-'0')+ca;
            if(n==1){
                st+=2;
                ca=1;
            }
            else{
                st++;
            }
        }
        return st+ca;
    }
}