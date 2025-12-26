import java.util.*;
class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int[] res=new int[N];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<N;i++)
            pq.add(new int[]{arr[i],i});
        int j=0,prev=-1;
        while(!pq.isEmpty()){
            int[] top=pq.poll();
            if(prev==-1 || top[0]!=prev)
                j++;
            res[top[1]]=j;
            prev=top[0];
        }
        return res;
    }
}
