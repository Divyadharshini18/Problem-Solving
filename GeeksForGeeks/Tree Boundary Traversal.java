import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {
    ArrayList<Integer> res=new ArrayList<>();
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        
        if(root==null)
            return res;
        if(!isLeaf(root))
            res.add(root.data);
        leftBoundary(root.left);
        leafBoundary(root);
        rightBoundary(root.right);
        return res;
    }
    boolean isLeaf(Node root){
        return root!=null && root.left==null && root.right==null;
    }
    void leftBoundary(Node root){
        while(root!=null && !isLeaf(root)){
            res.add(root.data);
            if(root.left!=null)
                root=root.left;
            else
                root=root.right;
        }
    }
    void rightBoundary(Node root){
        ArrayList<Integer> temp=new ArrayList<>();
        while(root!=null && !isLeaf(root)){
            temp.add(root.data);
            if(root.right!=null)
                root=root.right;
            else
                root=root.left;
        }
        Collections.reverse(temp);
        for(Integer val:temp)
            res.add(val);
    }
    void leafBoundary(Node root){
        if(root!=null){
            if(isLeaf(root))
                res.add(root.data);
            leafBoundary(root.left);
            leafBoundary(root.right);
        }
    }
}