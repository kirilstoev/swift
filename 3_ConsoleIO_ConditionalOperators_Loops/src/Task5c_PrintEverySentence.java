
import java.util.Scanner;

public class Task5c_PrintEverySentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String output = "";
        char[] arr1 = sentence.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == '.' || arr1[i] == '?' || arr1[i] == '!') {
                output += arr1[i];
                System.out.println(output);
                output = "";
                continue;
            } else if (arr1[i] == ' ' && output == "") {
                //This scenarios is when first sentence is printed and there is a space after that.
                continue;
            } else {
                output += arr1[i];
            }
        }
        System.out.println(output);
    }
}
