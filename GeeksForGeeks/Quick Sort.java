class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int l, int h) {
        // code here
        if(l<h){
            int p=partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }

    static int partition(int arr[], int l, int h) {
        // your code here
        int p=arr[h],i=l-1;
        for(int j=l;j<h;j++)
            if(arr[j]<p){
                i++;
                swap(arr,i,j);
            }
        swap(arr,i+1,h);
        return i+1;
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}