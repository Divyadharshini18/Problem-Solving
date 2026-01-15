class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int i=0,j=0;
        while(j<n){
            if(arr[j]!=0)
                arr[i++]=arr[j];
            j++;
        }
        while(i<n)
            arr[i++]=0;
    }
}