import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b=42;
        int remain;
        int count=0;
        boolean[] remainArr=new boolean[42];

        for(int i=0;i<10;i++){
            a=Integer.parseInt(sc.nextLine());
            remain=a%b;
            if(remainArr[remain]==true) count++;
            else remainArr[remain]=true;
        }

        System.out.println(10-count);

    }
}
