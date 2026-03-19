import java.util.*;
class Solution1 {
    public static int noOfWaysToClimb(int n,int[] dp){
        if(n<=2){
            dp[n]=n;
            return n;
        }
        int a,b;
        if(dp[n-1]==-1)
            a=noOfWaysToClimb(n-1,dp);
        else
            a=dp[n-1];
        if(dp[n-2]==-1)
            b=noOfWaysToClimb(n-2,dp);
        else
            b=dp[n-2];
        dp[n]=a+b;
        return a+b;
    }

    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return noOfWaysToClimb(n,dp);
    }
}