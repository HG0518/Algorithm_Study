import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        int c=Integer.parseInt(sc.nextLine());
        System.out.println(a+b-c);
        int aPlusb=Integer.parseInt(""+a+b);

        System.out.println(aPlusb-c);
    }
}
