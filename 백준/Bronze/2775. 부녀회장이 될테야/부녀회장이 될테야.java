import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int testCase=Integer.parseInt(sc.nextLine());
        int[]result=new int[testCase];
        for(int i=0;i<testCase;i++){
            int height=Integer.parseInt(sc.nextLine());
            int num=Integer.parseInt(sc.nextLine());
            result[i]=calcPeole(height,num);
        }
        for(int i:result)
            System.out.println(i);
    }
    
    static int calcPeole(int height, int i){
        if(height==0)return i;
        int sum=0;
        for(int k=1;k<=i;k++)
            sum+=calcPeole(height-1,k);
        return sum;
    }
}