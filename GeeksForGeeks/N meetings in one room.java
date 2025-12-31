import java.util.*;
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n=start.length;
        int  sc[][]=new int[n][2];
        for(int i=0;i<n;i++){
            sc[i][0]=start[i];
            sc[i][1]=end[i];
        }
        Arrays.sort(sc,(a,b)->a[1]-b[1]);
        int en=-1,c=0;
        for(int i=0;i<n;i++){
            if(sc[i][0]>en){
                c++;
                en=sc[i][1];
            }
        }
        return c;
    }
}
