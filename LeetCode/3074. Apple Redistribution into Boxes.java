import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int tot=0;
        for(int a:apple)
            tot+=a;
        int c=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            int n=capacity[i];
            tot-=n;
            c++;
            if(tot<=0)
                return c;
        }
        return c;
    }
}