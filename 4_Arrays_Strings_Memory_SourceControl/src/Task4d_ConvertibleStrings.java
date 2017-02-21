
import java.util.Scanner;

public class Task4d_ConvertibleStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] arr = text.toCharArray();
        String textNext = sc.nextLine();
        char[] arrNext = textNext.toCharArray();
        boolean check=false;
        for (int i = 0; i < arrNext.length; i++) {
            if (arr[i] != arrNext[i]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arrNext[i] == arr[j]) {
                        check = true;
                    } else {
                        check = false;
                    }
                }
            }
            else{
                check = true;
            }
        }
        System.out.println(check);
    }
}
