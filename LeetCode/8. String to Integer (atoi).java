class Solution {
    int k=0,si=1;
    public int myAtoi(String s) {
        k=0;
        si=1;
        int n=s.length(),j=0;
        while(j<n && s.charAt(j)==' ')
            j++;
        if(j<n && s.charAt(j)=='-'){
            si=-1;
            j++;
        }
        else if(j<n && s.charAt(j)=='+'){
            si=1;
            j++;
        }
        return Atoi(j,n,s);
    }
    public int Atoi(int i,int n,String s){
        if(i<n && (!(s.charAt(i)>='0' && s.charAt(i)<='9')))
            return si*k;
        if(i<n){
            int l=s.charAt(i)-'0';
            if(k>(Integer.MAX_VALUE-l)/10)
                return si==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            k=k*10+l;
            return Atoi(i+1,n,s);
        }
        else
            return si*k;
    }
}