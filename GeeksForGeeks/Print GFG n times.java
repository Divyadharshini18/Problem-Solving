class Solution {
    void printGfg(int N) {
        if(N==0)
            return;
        System.out.printf("GFG ");
        printGfg(N-1);
    }
}