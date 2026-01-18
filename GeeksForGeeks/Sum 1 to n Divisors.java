class Solution {
    public static int sumOfDivisors(int n) {
        // code here
        int su=1;
        for(int i=2;i<=n;i++)
            su+=sum(i);
        return su;
    }
    public static int sum(int n){
        int s=1;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                s+=i;
        return s+n;
    }
}