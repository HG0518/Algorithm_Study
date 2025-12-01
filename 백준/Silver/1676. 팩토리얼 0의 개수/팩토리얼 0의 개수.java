import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());

        BigInteger big=new BigInteger("1");

        long result=1;
        for(int i=num;i>0;i--){
            big=big.multiply(BigInteger.valueOf(i));
        }

        String resultToS=big.toString();
        int index;
        int pos=resultToS.length()-1;
        int zero=pos;
        while((index=resultToS.lastIndexOf("0",pos))!=-1){
            pos=index-1;
            if(pos+1!=zero) break;
            zero--;
        }

        System.out.println(resultToS.length()-zero-1);
    }
}