import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int subjectN=sc.nextInt();
        double[] scoreArr=new double[subjectN];
        double total=0;
        int score, max=0;
        double avg;

        sc.nextLine();
        for(int i=0;i<scoreArr.length;i++){
            score=sc.nextInt();
            if(max<score)max=score;
            scoreArr[i]=score;
        }

        for(int i=0;i<scoreArr.length;i++){
            scoreArr[i]=scoreArr[i]/max*100;
            total+=scoreArr[i];
        }

        avg=total/(double)subjectN;
        System.out.println(avg);

    }
}
