import java.util.*;
class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> eve=new PriorityQueue<>();
        PriorityQueue<Integer> odd=new PriorityQueue<>();
        int n=num;
        while(n>0){
            int k=n%10;
            if(k%2==0)
                eve.add(k);
            else
                odd.add(k);
            n/=10;
        }
        StringBuilder sb=new StringBuilder();
        while(num>0){
            if(num%10%2==0)
                sb.append(eve.poll());
            else
                sb.append(odd.poll());
            num/=10;
        }
        sb=sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}