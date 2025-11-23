import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=Integer.parseInt(sc.nextLine());
        b=Integer.parseInt(sc.nextLine());
        c=Integer.parseInt(sc.nextLine());

        String abc=a*b*c+"";
        int[] numCountList=new int[10];
        for(int i=0;i<abc.length();i++){
            int num=abc.charAt(i)-'0';
            numCountList[num]++;
        }

        for(int i:numCountList){
            System.out.println(i);
        }
    }
}
