import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        int total=0;
        for(int i=0;i<5;i++){
            input=sc.nextInt();
            total+=input*input;
        }
        System.out.println(total%10);
    }
}
