
import java.util.Scanner;

public class Task2b_PrintMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 1;
        int[][] arr = new int[num][num];
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                if (row % 2 == 0) {
                    arr[col][row] = k++;
                } else {
                    arr[num - 1 - col][row] = k++;
                }
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.printf("%4d", arr[row][col]);
            }
            System.out.println();
        }

    }

}
