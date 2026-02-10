package Codeforces;
import java.util.*;
public class Solution427A{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int po=0,ans=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(arr[i]>0)
                po+=arr[i];
            else if(arr[i]==-1 && po>0)
                po--;
            else if(arr[i]==-1 && po<=0)
                ans++;
        }
        System.out.println(ans);
        s.close();
    }
}