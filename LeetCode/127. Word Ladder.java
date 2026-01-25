import java.util.*;

class Pair{
    private String key;
    private Integer val;
    public Pair(String key,Integer val){
        this.key=key;
        this.val=val;
    }
    public String getKey(){
        return key;
    }
    public Integer getVal(){
        return val;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> hs=new HashSet<>(wordList);
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        hs.remove(beginWord);
        while(!q.isEmpty()){
            String curr=q.peek().getKey();
            int currstep=q.peek().getVal();
            q.poll();
            if(curr.equals(endWord))
                return currstep;
            char[] warr=curr.toCharArray();
            for(int i=0;i<curr.length();i++){
                char ogch = warr[i];
                for(char ch='a';ch<='z';ch++){
                    warr[i]=ch;
                    if(hs.contains(new String(warr))){
                        q.add(new Pair(new String(warr),currstep+1));
                        hs.remove(new String(warr));
                    }
                }
                warr[i]=ogch;
            }
        }
        return 0;
    }
}