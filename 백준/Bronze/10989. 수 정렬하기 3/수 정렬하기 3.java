import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int num=Integer.parseInt(br.readLine());
        int[] numList=new int[10001];
        for(int i=0;i<num;i++)
            numList[Integer.parseInt(br.readLine())]++;

        for(int i=0;i<numList.length;i++){
            if(numList[i]!=0){
                for(int j=0;j<numList[i];j++) {
                    sb.append(i);
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
