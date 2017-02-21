
import java.util.Scanner;

public class Task3c_PrintClusterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        boolean countSet = false;
        int prevNumber = 0;
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int number : arr) {
            if (number == prevNumber) {
                if (countSet == false) {
                    count++;
                    countSet = true;
                } else {
                    prevNumber=number;
                }
            }else{
                    prevNumber=number;
                    countSet = false;
            }
        }
        System.out.println(count);
    }
}
