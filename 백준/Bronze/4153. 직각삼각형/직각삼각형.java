import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] input=new int[3];
        while(true){
            for(int i=0;i<input.length;i++)
                input[i]=sc.nextInt();
            if(input[0]+input[1]+input[2]==0) break;
            Arrays.sort(input);
            sc.nextLine();
            if(Math.pow(input[2],2)==Math.pow(input[1],2)+
            Math.pow(input[0],2))
                System.out.println("right");
            else
                System.out.println("wrong");
            
        }
    }
}