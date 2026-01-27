import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}

class Solution {
    Node succ=null;
    Node decc=null;
    public void getSuccessor(Node root,int key){
        while(root!=null){
            if(key>=root.data)
                root=root.right;
            else{
                if(succ!=null && root.data<succ.data)
                    succ=root;
                if(succ==null)
                    succ=root;
                root=root.left;
            }
        }
        return;
    }
    public void getPredecessor(Node root,int key){
        while(root!=null){
            if(key<=root.data)
                root=root.left;
            else{
                if(decc!=null && root.data>decc.data)
                    decc=root;
                if(decc==null)
                    decc=root;
                root=root.right;
            }
        }
        return;
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> res=new ArrayList<>();
        getSuccessor(root,key);
        getPredecessor(root,key);
        res.add(decc);
        res.add(succ);
        return res;
    }
}