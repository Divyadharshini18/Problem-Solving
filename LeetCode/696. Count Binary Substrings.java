class Optimal {
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

class Better {
    public int countBinarySubstrings(String s) {
        int ans=0;
        int n=s.length();
        int i=0,z=0,o=0;
        while(i<n){
            while(i<n && s.charAt(i)=='0'){
                i++;
                z++;
                if(z<=o)
                    ans++;
            }
            while(i<n && s.charAt(i)=='1'){
                i++;
                o++;
                if(o<=z)
                    ans++;
            }
            z=0;
            while(i<n && s.charAt(i)=='0'){
                i++;
                z++;
                if(z<=o)
                    ans++;
            }
            o=0;
        }
        return ans;
    }
}