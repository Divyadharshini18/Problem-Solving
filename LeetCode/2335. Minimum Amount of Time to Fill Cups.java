import java.util.*;
class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:amount)
            if(n>0)
                pq.add(n);
        int sec=0;
        while(pq.size()>1){
            int a=pq.poll(),b=pq.poll();
            sec++;
            a--;
            b--;
            if(a>0)
                pq.add(a);
            if(b>0)
                pq.add(b);
        }
        if(pq.size()>0)
            sec+=pq.poll();
        return sec;
    }
}