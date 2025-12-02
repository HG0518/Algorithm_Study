import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        int[]stoi=new int[input.length()];
        int index=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='*') {
                index = i;
                continue;
            }
            stoi[i]=ch-'0';
        }
        int sum=0;
        int mul=3;
        int resultMul=0;

        for(int i=0;i<stoi.length;i++){
            if(i%2==0) mul=1;
            else mul=3;

            if(i==stoi.length-1) mul=1;

            if(i==index) {
                resultMul = mul;
                continue;
            }

            sum+=stoi[i]*mul;
        }

        int result=(10-sum%10)%10;

            while (true) {
                if (result % resultMul != 0) result += 10;
                else {
                    result /= resultMul;
                    break;
                }
            }


        System.out.println(result);

    }
}
