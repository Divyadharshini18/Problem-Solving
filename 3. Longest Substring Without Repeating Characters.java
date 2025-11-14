import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max=0,st=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(st));
                st++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-st+1);
        }
        return max;
    }
}