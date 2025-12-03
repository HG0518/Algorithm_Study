import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int result=0;
        for(int i=0;i<3;i++){
            String input=br.readLine();
            if(input.equals("Fizz")) continue;
            if(input.equals("Buzz")) continue;
            if(input.equals("FizzBuzz")) continue;
            else{
                result=Integer.parseInt(input)+3-i;
                break;
            }
        }
        String output="";
        if(result%3==0&&result%5==0)output="FizzBuzz";
        else if (result%3==0) output="Fizz";
        else if (result%5==0) output="Buzz";
        else output+=result;

        System.out.println(output);
    }
}