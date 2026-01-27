class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d%=n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
    }
    static void rev(int[] a,int i,int j){
        while(i<j){
            int tem=a[i];
            a[i]=a[j];
            a[j]=tem;
            i++;
            j--;
        }
    }
}