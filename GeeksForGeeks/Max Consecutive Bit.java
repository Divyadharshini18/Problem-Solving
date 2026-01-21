class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int c=0,d=0,m=0;
        for(int a:arr){
            if(a==1){
                d=0;
                c++;
                if(c>m)
                    m=c;
            }
            else{
                c=0;
                d++;
                if(d>m)
                    m=d;
            }
        }
        return m;
    }
}