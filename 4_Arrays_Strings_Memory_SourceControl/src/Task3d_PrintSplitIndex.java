
import java.util.Scanner;

public class Task3d_PrintSplitIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = 0;
        int sum = 0;
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int number : arr) {
            sum += number;
        }

        sum /= 2;

        for (int i = 0; i < arr.length; i++) {
            if (sum - arr[i] == 0) {
                index = i;
                break;
            } else {
                sum -= arr[i];
            }
        }
        System.out.println(index);
    }
}
