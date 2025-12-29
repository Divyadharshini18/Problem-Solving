import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,n=g.length,m=s.length;
        while(i<n && j<m){
            if(s[j]>=g[i])
                i++;
            j++;
        }
        return i;
    }
}