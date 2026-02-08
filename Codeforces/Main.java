package Codeforces;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int ans=Math.min(Math.abs(a-b)+Math.abs(a-c),Math.min(Math.abs(b-a)+Math.abs(b-c),Math.abs(c-a)+Math.abs(c-b)));
        System.out.println(ans);
        s.close();
    }
}