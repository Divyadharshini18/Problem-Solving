import java.util.*;
class Solution {
    static long fact=1,x=2;
    static ArrayList<Long> ans=new ArrayList<>();
    static ArrayList<Long> temp;
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        if(fact>n){
            fact=1;
            x=2;
            temp=ans;
            ans=new ArrayList<>();
            return temp;
        }
        ans.add(fact);
        fact*=x;
        x++;
        return factorialNumbers(n);
    }
}