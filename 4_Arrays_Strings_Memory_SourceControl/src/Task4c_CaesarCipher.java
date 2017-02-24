
import java.util.Scanner;

public class Task4c_CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] arr = text.toCharArray();
        String coding = sc.next();
        if ("encode".equals(coding)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >='a' && arr[i] <='z' || arr[i] >='A' && arr[i] <='Z') {
                    if (arr[i] == 'z') {
                        arr[i] = 'a';
                    } else if (arr[i] == 'Z') {
                        arr[i] = 'A';
                    } else {
                        arr[i] += 1;
                    }
                }
            }
            System.out.println(arr);
        } else if ("decode".equals(coding)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >='a' && arr[i] <='z' || arr[i] >='A' && arr[i] <='Z') {
                    if (arr[i] == 'a') {
                        arr[i] = 'z';
                    } else if (arr[i] == 'A') {
                        arr[i] = 'Z';
                    } else {
                        arr[i] -= 1;
                    }
                }
            }
            System.out.println(arr);
        }
    }
}
