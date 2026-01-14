import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0,k=-1,n=a.length,m=b.length;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                if(k==-1 || ans.get(k)!=a[i]){
                    ans.add(a[i]);
                    k++;
                }
                i++;
            }
            else{
                if(k==-1 || ans.get(k)!=b[j]){
                    ans.add(b[j]);
                    k++;
                }
                j++;
            }
        }
        while(i<n){
            if(k==-1 || ans.get(k)!=a[i]){
                ans.add(a[i]);
                k++;
            }
            i++;
        }
        while(j<m){
            if(k==-1 || ans.get(k)!=b[j]){
                ans.add(b[j]);
                k++;
            }
            j++;
        }
        return ans;
    }
}