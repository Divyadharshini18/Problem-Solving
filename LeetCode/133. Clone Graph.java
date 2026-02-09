import java.util.*;
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    HashMap<Node, Node> hm=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        if(hm.containsKey(node))
            return hm.get(node);
        Node n=new Node(node.val);
        hm.put(node,n);
        for(Node a:node.neighbors){
            n.neighbors.add(cloneGraph(a));
        }
        return n;
    }
}