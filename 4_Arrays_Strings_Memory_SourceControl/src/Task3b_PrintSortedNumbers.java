
import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintSortedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int out;
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int number : arr) {
            System.out.print(number+" ");
        }
    }
}
