import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strList = input.split(" ");
        int count = strList.length;
        for(String str:strList){
            if(str.isEmpty())count--;
        }
        System.out.println(count);
    }
}