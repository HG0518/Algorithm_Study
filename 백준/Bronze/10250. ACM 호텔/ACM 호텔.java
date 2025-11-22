import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int width,height,guestNum,testNum;
        testNum=Integer.parseInt(sc.nextLine());
        String[] strList=new String[testNum];

        for(int i=0;i<testNum;i++){
            height=sc.nextInt();
            width=sc.nextInt();
            guestNum=sc.nextInt();
            sc.nextLine();
            strList[i]=allocateRoom(guestNum,height);
        }

        for(int i=0;i<testNum;i++){
            System.out.println(strList[i]);
        }

    }

    static String allocateRoom(int guestNum, int height){
        int roomHNum,roomWNum;
        roomHNum=(guestNum-1)%height+1;
        roomWNum=(guestNum-1)/height+1;
        String result = roomHNum+(roomWNum<10?"0"+roomWNum:""+roomWNum);

        return result;
    }
}
