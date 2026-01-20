import java.util.*;
class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> div=new ArrayList<>();
        div.add(1);
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                div.add(i);
        if(n>=n/2 && n>1)
            div.add(n);
        int m=div.size();
        for(int i=0;i<m;i++)
            System.out.print(div.get(i)+" ");
        return;
    }
}