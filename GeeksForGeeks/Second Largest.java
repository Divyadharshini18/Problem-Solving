class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int fm=-1,sm=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fm){
                sm=fm;
                fm=arr[i];
            }
            else if(arr[i]>sm && arr[i]<fm)
                sm=arr[i];
        }
        return sm;
    }
}