import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=arr.length;
        int max=0;
        for(int j=n-1;j>=0;j--)
            if(arr[j]>=max){
                max=arr[j];
                a.add(arr[j]);
            }
        Collections.reverse(a);
        return a;
    }
}
