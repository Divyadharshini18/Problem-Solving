class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1,k=arr[i];
            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=k;
        }
    }
}