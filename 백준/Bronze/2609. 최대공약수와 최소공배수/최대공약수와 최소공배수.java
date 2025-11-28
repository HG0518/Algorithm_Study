import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numA=sc.nextInt();
        int numB=sc.nextInt();
        
        int a=numA;
        int b=numB;
        
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        int gcd=a;
        int lcm=numA*numB/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}