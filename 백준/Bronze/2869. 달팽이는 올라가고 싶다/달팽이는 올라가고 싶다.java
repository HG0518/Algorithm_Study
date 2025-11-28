import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String input=bf.readLine();
        StringTokenizer st=new StringTokenizer(input);
        int up=Integer.parseInt(st.nextToken());
        int down=Integer.parseInt(st.nextToken());
        int height=Integer.parseInt(st.nextToken());

        int gap=up-down;
        int day=(height-up)/gap;
        if((height-up)%gap!=0)day++;
        day++;
        System.out.println(day);

    }
}