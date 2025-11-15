class Solution {
    public String convert(String s, int numRows) {
        int l=s.length();
        if(l<=numRows || numRows==1)
            return s;
        int n=2*(numRows-1),m=0,k=0;
        boolean f1=true,f2=true;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            f1=true;
            f2=true;
            k=i;
            sb.append(s.charAt(k));
            while(k<l && f1==true){
                f1=false;
                f2=false;
                if(k+n<l && n!=0){
                    k+=n;
                    sb.append(s.charAt(k));
                    f1=true;
                }
                if(k+m<l && m!=0 && (f1==true || n==0)){
                    k+=m;
                    sb.append(s.charAt(k));
                    f2=true;
                    f1=true;
                }
                if(k+m>=l && f2==false)
                    f1=false;
            }
            n-=2;
            m+=2;
        }
        String ans=sb.toString();
        return ans;
    }
}