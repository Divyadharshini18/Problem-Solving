class Solution {
    int missingNum(int arr[]) {
        // code here
        long s=0,n=0;
        for(int a:arr){
            s+=a;
            n++;
        }
        n++;
        long e=((n*(n+1))/2)-s;
        return e==0?-1:(int)e;
    }
}