import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardNum, targetNum;
        cardNum = sc.nextInt();
        targetNum = sc.nextInt();
        sc.nextLine();
        int[] card = new int[cardNum];
        int[] sum = new int[cardNum * (cardNum - 1) * (cardNum - 2)];
        for (int i = 0; i < card.length; i++)
            card[i] = sc.nextInt();

        int index = 0;
        for (int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    sum[index++] = card[i] + card[j] + card[k];
                }
            }
        }

        int min = targetNum;
        for (int i : sum) {
            int gap = targetNum - i;
            if (gap >= 0 && gap < min) {
                min = gap;
            }
        }

        System.out.println(targetNum - min);
    }
}
