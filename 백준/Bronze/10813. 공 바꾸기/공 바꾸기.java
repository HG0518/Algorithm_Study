import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bucketNum;
        int iterationNum;

        bucketNum=sc.nextInt();
        iterationNum=sc.nextInt();
        sc.nextLine();
        int[] bucket=new int[bucketNum+1];
        for(int i=1;i<=bucketNum;i++)
            bucket[i]=i;

        for(int i=0;i<iterationNum;i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            sc.nextLine();

            int tmp=bucket[first];
            bucket[first]=bucket[second];
            bucket[second]=tmp;
        }

        for(int i=1;i<=bucketNum;i++){
            System.out.print(bucket[i]+" ");
        }
    }
}
