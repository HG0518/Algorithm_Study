import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strLen = Integer.parseInt(sc.nextLine().trim());
        String str = sc.nextLine().trim();
        double[] strToInt = new double[str.length()];
        for (int i = 0; i < str.length(); i++)
            strToInt[i] = str.charAt(i) - 'a' + 1;

        int result = (int) hashing(strToInt);
        System.out.println(result);
    }

    static double hashing(double[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i] * Math.pow(31, i);
        }
        return sum % 1234567891;
    }
}
