
import java.util.Scanner;

public class Task2f_PrintMirrorNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String mirrornum = "";

        while (num > 0) {
            mirrornum += num % 10;
            num /= 10;
        }
        System.out.println(mirrornum);
    }
}
