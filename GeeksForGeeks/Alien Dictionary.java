import java.util.*;
class Solution {
    public String bfs(ArrayList<ArrayList<Integer>> adj,int[] ind){
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=0;i<26;i++){
            if(ind[i]==0)
                q.add(i);
        }
        
        StringBuilder sb=new StringBuilder();
        
        while(!q.isEmpty()){
            int x=q.poll();
            sb.append((char)(x+'a'));
            for(int val:adj.get(x)){
                ind[val]--;
                if(ind[val]==0)
                    q.add(val);
            }
        }
        return sb.toString();
    }
    public String findOrder(String[] words) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] ind=new int[26];
        
        Arrays.fill(ind,-1);
        
        for(int i=0;i<26;i++)
            adj.add(new ArrayList<>());
        
        int c=0;
        for(String word:words){
            for(char ch:word.toCharArray()){
                if(ind[ch-'a']==-1){
                    ind[ch-'a']=0;
                    c++;
                }
            }
        }

        for(int i=0;i<words.length-1;i++){
            String s1=words[i];
            String s2=words[i+1];
            int len=Math.min(s1.length(),s2.length());
            boolean valid=false;
            for(int j=0;j<len;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    ind[s2.charAt(j)-'a']++;
                    valid=true;
                    break;
                }
            }
            if(!valid && s1.length()>s2.length())
                return "";
        }
        String ans= bfs(adj,ind);
        if(ans.length()==c)
            return ans;
        return "";
    }
}