import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> freq=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(char task:tasks)
            freq.put(task,freq.getOrDefault(task,0)+1);
        for(int f:freq.values())
            pq.add(f);
        int cycle=n+1,time=0;
        while(!pq.isEmpty()){
            ArrayList<Integer> arr=new ArrayList <>();
            int i=0;
            while(i<cycle && !pq.isEmpty()){
                int f=pq.poll();
                f--;
                time++;
                if(f>0)
                    arr.add(f);
                i++;
            }
            if(pq.isEmpty() && arr.isEmpty())
                break;
            if(pq.isEmpty())
                time+=(cycle-i);
            for(int f:arr)
                pq.add(f);
        }
        return time;
    }
}