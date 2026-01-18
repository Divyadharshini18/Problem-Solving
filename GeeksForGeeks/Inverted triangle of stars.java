class Solution {
    static String[] invIsoTriangle(int N) {
        // code here
        String[] sb=new String[N];
        for(int i=N;i>=1;i--){
            int k=i*2-1;
            k+=N-i;
            char[] ch=new char[k];
            for(int j=0;j<k;j++){
                if(j<N-i)
                    ch[j]=' ';
                else
                    ch[j]='*';
            }
            String s=new String(ch);
            sb[N-i]=s;
        }
        return sb;
    }
};