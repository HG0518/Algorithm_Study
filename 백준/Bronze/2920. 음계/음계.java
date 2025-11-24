import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        StringBuilder input=new StringBuilder(8);
        String output;
        for(int i=0;i<input.capacity();i++){
            input.append(sc.next());
        }
        if(input.toString().equals("12345678")) output="ascending";
        else if(input.toString().equals("87654321")) output="descending";
        else output="mixed";

        System.out.println(output);
    }
}