class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
       this.left = left;
        this.right = right;
    }
}

class Solution {
    int s=0;
    public int sumRootToLeaf(TreeNode root) {
        sum(root,new StringBuilder());
        return s;
    }

    public void sum(TreeNode root,StringBuilder sb){
        if(root==null)
            return;
        sb.append(root.val);
        if(root.left==null && root.right==null)
            s+=bin(sb);
        else{
            sum(root.left,sb);
            sum(root.right,sb);
        }
        sb.deleteCharAt(sb.length()-1);
    }
    
    public int bin(StringBuilder sb){
        int su=0;
        for(int i=sb.length()-1,j=0;i>=0;i--,j++)
            su+=(sb.charAt(i)-'0')*Math.pow(2,j);
        return su;
    }
}