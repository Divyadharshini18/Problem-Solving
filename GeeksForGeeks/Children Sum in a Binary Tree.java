import java.util.*;

class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root ==null || (root.left==null && root.right==null))
            return true;
        int sum=0;
        if(root.left!=null)
            sum+=root.left.data;
        if(root.right!=null)
            sum+=root.right.data;
        if(root.data != sum)
            return false;
        return isSumProperty(root.left) && isSumProperty(root.right);
    }
}