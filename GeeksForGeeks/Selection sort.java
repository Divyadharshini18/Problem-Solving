class Solution {
    void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int m=i;
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[m])
                    m=j;
            int temp=arr[m];
            arr[m]=arr[i];
            arr[i]=temp;
        }
    }
}