import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int peopelNum,pBundle,pSingle,
            pQuantity,tBundle,tQuantity;
        int[] tshirtsList=new int [6];
        
        peopelNum=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<tshirtsList.length;i++)
            tshirtsList[i]=sc.nextInt();
        sc.nextLine();
        tQuantity=sc.nextInt();
        pQuantity=sc.nextInt();
        
        tBundle=0;
        for(int i=0;i<tshirtsList.length;i++){
            tBundle+=Math.ceil(tshirtsList[i]/(double)tQuantity);
        }
        pBundle=peopelNum/pQuantity;
        pSingle=peopelNum-pBundle*pQuantity;
        
        System.out.println(tBundle);
        System.out.print(pBundle+" "+pSingle);
    }
}