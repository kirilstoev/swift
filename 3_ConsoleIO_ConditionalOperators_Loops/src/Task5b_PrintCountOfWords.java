
import java.util.Scanner;
import java.lang.*;

public class Task5b_PrintCountOfWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char[] words = sentence.toCharArray();
        int wordCount = 0;
        boolean checkLetter = true;
        for (int i = 0; i < words.length; i++) {
                if ('a' <= words[i] && words[i] <= 'z'||'A' <= words[i] && words[i] <= 'Z') {
                    //Here we will check if value is valid letter. If not then set the checkLetter = false;
                    checkLetter = true;
                } else {
                    if (checkLetter == true) {
                        //Here we will check if value is a space and if out line not start with a space.
                        //If value is a space and checkLetter is true this means that previous characters
                        //are valid word and we will update the word count;
                        wordCount++;
                        checkLetter=false;
                    }
            }
        }
        System.out.println(wordCount);
    }
}