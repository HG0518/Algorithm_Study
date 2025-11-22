import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,index,max;
        index=max=-1;
        for(int i=0;i<9;i++){
            input=Integer.parseInt(sc.nextLine());
            if(input>max){
                max=input;
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
