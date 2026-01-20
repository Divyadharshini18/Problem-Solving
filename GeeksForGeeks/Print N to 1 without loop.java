class Solution{
    void recursion(int N) {
        if(N==0)
            return;
        System.out.print(N+" ");
        recursion(N-1);
    }
}