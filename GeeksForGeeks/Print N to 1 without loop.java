class Solution{
    void printNos(int N) {
        if(N==0)
            return;
        System.out.print(N+" ");
        printNos(N-1);
    }
}