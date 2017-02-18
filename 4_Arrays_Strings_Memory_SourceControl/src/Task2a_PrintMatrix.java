
import java.util.Scanner;

public class Task2a_PrintMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int l = 0; l < num; l++) {
                int number = sc.nextInt();
                arr[i][l] = number;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.printf("%4d", arr[col][row]);
            }
            System.out.println();
        }
        
        
        for (int row = 0; row < arr.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < arr.length; col++) {
                    System.out.printf("%4d", arr[col][row]);
                }
            } else {
                for (int col = arr.length; col > 0; col--) {
                    System.out.printf("%4d", arr[col][row]);
                }
            }
            System.out.println();
        }
        
    }
}
