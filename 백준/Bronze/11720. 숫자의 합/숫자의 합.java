import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int result=0;
        for(int i=0;i<str.length();i++){
            result+=(int)(str.charAt(i)-'0');
        }
        System.out.println(result);
    }
}
