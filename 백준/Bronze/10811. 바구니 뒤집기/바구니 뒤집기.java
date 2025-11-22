import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int bucketSize, iteration;
       int leftBucketNum, rightBucketNum;

       bucketSize=sc.nextInt();
       iteration=sc.nextInt();
       sc.nextLine();

       int[] bucket=new int[bucketSize+1];
       for(int i=1;i<bucket.length;i++){
           bucket[i]=i;
       }
       for(int i=0;i<iteration;i++){
           leftBucketNum=sc.nextInt();
           rightBucketNum=sc.nextInt();
           sc.nextLine();

           while(rightBucketNum>leftBucketNum){
               int tmp=bucket[leftBucketNum];
               bucket[leftBucketNum]=bucket[rightBucketNum];
               bucket[rightBucketNum]=tmp;
               leftBucketNum++;
               rightBucketNum--;
           }
       }
       for(int i=1;i<bucket.length;i++){
           System.out.print(bucket[i]+" ");
       }
    }
}
