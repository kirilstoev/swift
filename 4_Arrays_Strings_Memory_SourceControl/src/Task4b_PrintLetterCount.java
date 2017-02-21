
import static java.lang.Character.toLowerCase;
import java.util.Scanner;

public class Task4b_PrintLetterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char arr[] = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (toLowerCase(arr[i]) == toLowerCase(arr[j])) {
                    count++;
                    arr[j] = ' ';
                }
            }
            if (arr[i] != ' ') {
                System.out.format("%s(%d)%n", toLowerCase(arr[i]), count);
            }
        }
    }
}
