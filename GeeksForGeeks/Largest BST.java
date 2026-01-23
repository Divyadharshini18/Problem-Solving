class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class Solution {
    static int[] maxBST(Node root){
        if(root==null)
            return new int[]{0,Integer.MAX_VALUE,Integer.MIN_VALUE};
        int[] left = maxBST(root.left);
        int[] right = maxBST(root.right);
        if(root.data>left[2] && root.data<right[1])
            return new int[]{ left[0]+right[0]+1, Math.min(root.data,left[1]),Math.max(root.data,right[2])};
        return new int[]{Math.max(left[0],right[0]),Integer.MIN_VALUE,Integer.MAX_VALUE};
    }

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        int ans[]=maxBST(root);
        return ans[0];
    }
}