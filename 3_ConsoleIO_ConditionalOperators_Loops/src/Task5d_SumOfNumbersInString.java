
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
            if (sentenceArray[i] == '0'
                    || sentenceArray[i] == '1'
                    || sentenceArray[i] == '2'
                    || sentenceArray[i] == '3'
                    || sentenceArray[i] == '4'
                    || sentenceArray[i] == '5'
                    || sentenceArray[i] == '6'
                    || sentenceArray[i] == '7'
                    || sentenceArray[i] == '8'
                    || sentenceArray[i] == '9') {
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
