import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str="";
        boolean[] answer=new boolean[5];
        int count=0;
        while(true){
            str=sc.nextLine();
            if(str.equals("0"))break;
            answer[count++]=check(str);
            int length=answer.length;
            if(count>=length){
                answer=Arrays.copyOf(answer,length*2);
            }
        }
        for(int i=0;i<count;i++){
            if(answer[i]==true) System.out.println("yes");
            else System.out.println("no");
        }
    }
    
    static boolean check(String input){
        int i=0;
        while(i<input.length()-i){
            char front=input.charAt(i);
            char back=input.charAt(input.length()-i-1);
            if(front!=back){
                return false;
            }
            i++;
        }
        return true;
    }
}