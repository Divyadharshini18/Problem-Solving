import java.util.*;
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] s=Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(s,(a,b)->{
            int a1=Integer.bitCount(a);
            int b1=Integer.bitCount(b);
            if(a1==b1)
                return a-b;
            return a1-b1;
        });
        int i=0;
        for(Integer n:s){
            arr[i]=n;
            i++;
        }
        return arr;
    }
}

