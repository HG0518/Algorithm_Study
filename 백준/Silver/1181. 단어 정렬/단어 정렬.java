import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());

        String[] input=new String[num];
        int length=input.length;
        for(int i=0;i<length;i++){
            String tmp=br.readLine();
            if(i==0) {
                input[i] = tmp;
                continue;
            }
            if(isEqual(input,tmp,i)){
                length--;
                i--;
                continue;
            }
            input[i]=tmp;
        }
        sortList(input, length);

        for(int i=0;i<length;i++)
            System.out.println(input[i]);

    }

    static void sortList(String[] input, int length){
        Arrays.sort(input, 0,length,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length()-o2.length();
            }
        });
    }

    static boolean isEqual(String[] list, String input, int length){
        for(int i=0;i<length;i++){
            if(list[i].equals(input))return true;
        }
        return false;
    }
}