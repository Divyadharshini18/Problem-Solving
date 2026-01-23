import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}

class Solution {
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // code here
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        inorder(root1,a1);
        inorder(root2,a2);
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i)<=a2.get(j)){
                res.add(a1.get(i));
                i++;
            }
            else{
                res.add(a2.get(j));
                j++;
            }
        }
        while(i<a1.size()){
            res.add(a1.get(i));
            i++;
        }
        while(j<a2.size()){
            res.add(a2.get(j));
            j++;
        }
        return res;
    }
    public void inorder(Node root,ArrayList<Integer> a){
        if(root==null)
            return;
        inorder(root.left,a);
        a.add(root.data);
        inorder(root.right,a);
    }
}