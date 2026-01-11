import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        while(i<n-1){
            int fo=0;
            while(i<n-1 && arr[i]==arr[i+1]){
                i++;
                fo=1;
            }
            if(fo==1)
                ans.add(arr[i]);
            i++;
        }
        return ans;
    }
}