import java.util.*;
class Solution1 {
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

class Solution2 {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]==b[1]?a[0]-b[0]:a[1]-b[1]));
        for(int n:arr)
            pq.add(new int[]{n,setBit(n)});
        for(int i=0;i<arr.length;i++)
            arr[i]=pq.poll()[0];
        return arr;
    }
    public int setBit(int n){
        int o=0;
        while(n>0){
            if(n%2==1)
                o++;
            n/=2;
        }
        return o;
    }
}