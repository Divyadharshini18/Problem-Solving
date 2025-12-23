import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        List<Integer> a=new ArrayList<>();
        int t=0,l=0,r=m-1,b=n-1;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++)
                a.add(mat[t][i]);
            t++;
            for(int j=t;j<=b;j++)
                a.add(mat[j][r]);
            r--;
            if(t<=b){
                for(int k=r;k>=l;k--)
                    a.add(mat[b][k]);
                b--;
            }
            if(l<=r){
                for(int o=b;o>=t;o--)
                    a.add(mat[o][l]);
                l++;
            }
        }
        return a;
    }
}