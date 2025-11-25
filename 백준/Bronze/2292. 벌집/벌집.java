import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int pass=getPass(input);
        System.out.println(pass);
    }
    static int getPass(int num){
        int max=1;
        int i;
        for(i=0;max<num;i++){
            max+=6*i;
            if(max>=num)break;
        }
        return i+1;
    }
}
