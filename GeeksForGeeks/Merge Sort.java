import java.util.*;
class Solution {
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l==r)
            return;
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    void merge(int arr[],int l,int m,int r){
        int i=l,j=m+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            if(arr[j]<=arr[i]){
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=m){
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){
            temp.add(arr[j]);
            j++;
        }
        for(int k=l;k<=r;k++)
            arr[k]=temp.get(k-l);
    }
}