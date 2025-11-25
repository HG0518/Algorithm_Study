import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(getMinDSum(input));
    }
    
    static int getMinDSum(int num){
        int digit=getDigit(num);
        int gap=num/(int)Math.pow(10,digit)+9*digit;
        int min=num-gap;
        for(int i=min;i<num;i++){
            if(dissasemblSum(i)==num) return i;
        }
        return 0;
    }
    
    static int dissasemblSum(int num){
        int digit=getDigit(num);
        int dSum=num;
        int tmp=num;
        for(int i=digit;i>=0;i--){
            int highDigit=(int)Math.pow(10,i);
            dSum+=tmp/highDigit;
            tmp%=highDigit;
        }
        return dSum;
    }
    
    static int getDigit(int num){
        int digit=1;
        for(int i=0;i<7;i++){
            int tmp=(int)Math.pow(10,i);
            if(num/tmp>0){
                digit=i;
            }
            else break;
        }
        return digit;
    }
}