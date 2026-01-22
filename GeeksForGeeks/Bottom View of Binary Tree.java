import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    int max=0;
    int min=0;
    public void preOrder(Node root,int row,int col,HashMap<Integer,int[]> mp){
        if(root==null)
            return;
        if(root!=null){
            if(!mp.containsKey(col))
                mp.put(col,new int[]{root.data,row});
            else{
                if(row>=mp.get(col)[1]){
                    mp.get(col)[0]=root.data;
                    mp.get(col)[1]=row;
                }
            } 
            if(col>max)
                max=col;
            if(col<min)
                min=col;
            preOrder(root.left,row+1,col-1,mp);
            preOrder(root.right,row+1,col+1,mp);
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        HashMap<Integer,int[]> mp=new HashMap<>();
        preOrder(root,0,0,mp);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=min;i<=max;i++)
            res.add(mp.get(i)[0]);
        return res;
    }
}