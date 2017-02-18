
import java.util.Scanner;

public class Task5a_StringWoVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String output = "";
        char[] arr1 = sentence.toCharArray();
        for (char element:arr1) {
            if (element != 'a'
                    && element != 'A'
                    && element != 'e'
                    && element != 'E'
                    && element != 'i'
                    && element != 'I'
                    && element != 'o'
                    && element != 'O'
                    && element != 'u'
                    && element != 'U') {
                System.out.print(element);;
            }
        }
        System.out.println(output);
    }
}
