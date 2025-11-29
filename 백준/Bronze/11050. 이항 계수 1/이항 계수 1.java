import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        if(k>n/2)k=n-k;
        int a=1;
        int b=1;
        while(k>0){
            a*=n;
            b*=k;
            k--;
            n--;
        }
        System.out.println(a/b);
    }
}
