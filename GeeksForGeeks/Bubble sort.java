class Solution {
    public static void bubbleSort(int arr[]) {
        int n=arr.length;
        BS(arr,n);
    }
    public static void BS(int[] arr,int n){
        if(n==1)
            return;
        boolean swap=false;
        for(int j=0;j<n-1;j++)
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=true;
            }
        if(!swap)
            return;
        BS(arr,n-1);
    }
}