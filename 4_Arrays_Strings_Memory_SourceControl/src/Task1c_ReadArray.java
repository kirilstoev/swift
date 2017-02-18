
import java.util.Arrays;
import java.util.Scanner;

public class Task1c_ReadArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int number = sc.nextInt();
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
