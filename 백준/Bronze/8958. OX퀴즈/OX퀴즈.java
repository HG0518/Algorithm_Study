import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int testNum=sc.nextInt();
        int[]output=new int[testNum];
        sc.nextLine();
        for(int i=0;i<testNum;i++){
            output[i]=score(sc);
        }
        for(int i:output) System.out.println(i);
    }

    static int score(Scanner sc){
        String input=sc.nextLine();
        int score,count;
        score=count=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='O'){
                count++;
                score+=count;
            }
            else{
                count=0;
            }
        }
        return score;
    }
}