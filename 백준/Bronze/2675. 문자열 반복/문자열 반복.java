import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum=sc.nextInt();
        sc.nextLine();
        String[]resultList=new String[testNum];
        for(int i=0;i<resultList.length;i++)
            resultList[i]=makeIteration(sc);

        for(String i:resultList)
            System.out.println(i);
    }

    static String makeIteration(Scanner sc){
        String[]input=sc.nextLine().split(" ");
        int iterationNum=Integer.parseInt(input[0]);
        StringBuilder sb = new StringBuilder(iterationNum*input[1].length());
        for(int i=0;i<input[1].length();i++)
            for(int j=0;j<iterationNum;j++)
                sb.append(input[1].charAt(i));

        return sb.toString();
    }
}
