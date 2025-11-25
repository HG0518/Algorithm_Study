import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numQuantity=Integer.parseInt(sc.nextLine());
        int[] numList=new int[numQuantity];
        for(int i=0;i<numList.length;i++)
            numList[i]=sc.nextInt();
        int count=0;
        for(int i:numList){
            if(isPrime(i))count++;
        }
        System.out.println(count);
        
        
    }
    
    static boolean isPrime(int num){
        if(num<=1)return false;
        double checkNum=Math.sqrt(num);
        for(int i=2;i<=checkNum;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}