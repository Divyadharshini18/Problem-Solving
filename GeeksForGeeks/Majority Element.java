class Solution {
    int majorityElement(int arr[]) {
        // code here
        int curr=-1,c=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(c==0){
                curr=arr[i];
                c=1;
            }
            else{
                if(arr[i]==curr)
                    c++;
                else
                    c--;
            }
        }
        c=0;
        for(int a:arr)
            if(a==curr)
                c++;
        return c>n/2?curr:-1;
    }
}