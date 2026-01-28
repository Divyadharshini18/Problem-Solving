// User function Template for Java
import java.util.*;
// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0,n=a.length,m=b.length,k=-1;
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