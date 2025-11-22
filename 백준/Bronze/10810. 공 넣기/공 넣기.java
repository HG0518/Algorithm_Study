import java.util.*;
public class Main {
    public static void main(String[] args) {
        int N,M;
        int startIndex,endIndex,num;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        sc.nextLine();

        int[] arr = new int[N+1];
        for(int i=0;i<M;i++){
            startIndex=sc.nextInt();
            endIndex=sc.nextInt();
            num=sc.nextInt();
            sc.nextLine();

            for(int j=startIndex;j<=endIndex;j++){
                arr[j]=num;
            }
        }

        for(int i=1;i<=N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
