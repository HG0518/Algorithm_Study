import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean[] students = new boolean[31];
        for(int i=1;i<students.length-2;i++){
            int studentN=Integer.parseInt(sc.nextLine());
            students[studentN]=true;
        }
        for(int i=1;i<students.length;i++){
            if(students[i]!=true)
                System.out.println(i);
        }

    }
}
