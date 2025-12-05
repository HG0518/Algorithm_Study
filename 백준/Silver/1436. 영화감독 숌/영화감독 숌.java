import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int result=666;
        int count=0;
    
        while(count<num){
            if(isSix(result)==true){
                count++;
            }
            result++;
        }
        result--;
        System.out.println(result);
        
    }
    
    static boolean isSix(int num){
        String tmp=""+num;
        return !(tmp.indexOf("666")==-1);
    }
}
