package Codeforces;
import java.util.*;
public class Solution1703A {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            String str=s.next();
            if( (str.charAt(0)=='Y' || str.charAt(0)=='y') && (str.charAt(1)=='E' || str.charAt(1)=='e') && (str.charAt(2)=='S' || str.charAt(2)=='s') )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        s.close();
    }
}