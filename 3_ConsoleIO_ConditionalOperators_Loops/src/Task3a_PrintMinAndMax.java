
import java.util.Scanner;

public class Task3a_PrintMinAndMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int minValue = 0;
        int maxValue = 0;
        for (int i = 0; i < num; i++) {
            int newNum = sc.nextInt();
            if (i == 0) {
                minValue = newNum;
                maxValue = newNum;
            } else {
                if (minValue > newNum) {
                    minValue = newNum;
                } else if (maxValue < newNum) {
                    maxValue = newNum;
                }
            }
        }
        System.out.format("%d %d", minValue, maxValue);
    }
}
