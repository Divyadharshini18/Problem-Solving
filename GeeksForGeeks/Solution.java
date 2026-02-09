// User function Template for Java

class Solution {
    
    public int find_par(int v,int par[]){
        if(par[v]==v)
            return v;
        return find_par(par[v],par);
    }
    
    // Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[]) {
        // add your code here
        int upa=find_par(a,par);
        int upb=find_par(b,par);
        
        if(rank[upa]<rank[upb])
            par[upa]=upb;
        else if(rank[upb]<rank[upa])
            par[upb]=upa;
        else{
            par[upb]=upa;
            rank[upa]++;
        }
            
    }

    // Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[]) {
        // add your code here
        return find_par(a,par)==find_par(b,par);
    }
}