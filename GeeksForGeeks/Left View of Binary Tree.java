import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    ArrayList<Integer> res=new ArrayList<>();
    public void pre(Node root,int row){
        if(root==null)
            return;
        if(row==res.size())
            res.add(root.data);
        pre(root.left,row+1);
        pre(root.right,row+1);
    }
    public ArrayList<Integer> leftView(Node root) {
        pre(root,0);
        return res;
    }
}