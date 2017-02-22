
import java.util.Scanner;

public class Task5d_SumOfNumbersInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char[] sentenceArray = sentence.toCharArray();
        int interValue = 0;
        char previousChar = ' ';
        String number = "";
        int sum = 0;
        for (int i = 0; i < sentenceArray.length; i++) {
            if ('0'<=sentenceArray[i] && sentenceArray[i] <= '9') {
                if (previousChar != ' ') {
                    number += sentenceArray[i];
                    previousChar = sentenceArray[i];
                } else {
                    number += sentenceArray[i];
                    previousChar = sentenceArray[i];
                }
            } else {
                if (previousChar != ' ') {
                    sum += Integer.parseInt(number);
                    number = "";
                    previousChar = ' ';
                    
                    //x = x*10+number
                }
            }
        }
        System.out.println(sum);
    }
}
