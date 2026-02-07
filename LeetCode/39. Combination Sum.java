import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        com(target,candidates,0,new ArrayList<>(),res);
        return res;
    }
    public void com(int t,int[] can,int ind,List<Integer> curr,List<List<Integer>> res){
        if(t==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(ind==can.length || t<0)
            return;
        curr.add(can[ind]);
        com(t-can[ind],can,ind,curr,res);
        curr.remove(curr.size()-1);
        com(t,can,ind+1,curr,res);
    }
}