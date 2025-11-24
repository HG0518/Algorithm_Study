import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] alphaList=new int[26];
        Arrays.fill(alphaList,-1);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int listIndex=ch-'a';
            int strIndex=str.indexOf(ch);
            alphaList[listIndex]=strIndex;
        }
        for(int i:alphaList){
            System.out.print(i+" ");
        }
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