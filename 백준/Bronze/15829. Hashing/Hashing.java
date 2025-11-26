import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strLen = Integer.parseInt(sc.nextLine().trim());
        String str = sc.nextLine().trim();
        int[] strToInt = new int[strLen];
        for (int i = 0; i < strToInt.length; i++)
            strToInt[i] = str.charAt(i) - 'a' + 1;

        long result = hashing(strToInt);
        System.out.println(result);
    }

    static long hashing(int[] list) {
        long sum = 0;
        long pow=1;
        long mod=1234567891;

        for (int i = 0; i < list.length; i++) {
            sum=(sum+list[i]*pow)%mod;
            pow=(pow*31)%mod;
        }
        return sum;
    }
}
