class Solution {
    public boolean checkValidString(String s) {
        int mi=0,ma=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                mi++;
                ma++;
            }
            else if(ch==')'){
                mi--;
                ma--;
            }
            else{
                ma++;
                mi--;
            }
            if(ma<0)
                return false;
            if(mi<0)
                mi=0;
        }
        return mi==0;
    }
}