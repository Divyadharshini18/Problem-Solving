import java.util.*;
class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        int max=0;
        Arrays.sort(arr);
        String an=new String();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if(arr[i].equals(arr[j]))
                    c+=1;
                else
                    break;
            }
            if(c>max){
                max=c;
                an=arr[i];
            }
        }
        String[] ans=new String[2];
        ans[0]=an;
        ans[1]=Integer.toString(max);
        return ans;
    }
}