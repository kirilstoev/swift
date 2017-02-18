
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
                if (words[i] != 'a'
                        && words[i] != 'b'
                        && words[i] != 'c'
                        && words[i] != 'd'
                        && words[i] != 'e'
                        && words[i] != 'f'
                        && words[i] != 'g'
                        && words[i] != 'h'
                        && words[i] != 'i'
                        && words[i] != 'j'
                        && words[i] != 'k'
                        && words[i] != 'l'
                        && words[i] != 'm'
                        && words[i] != 'n'
                        && words[i] != 'o'
                        && words[i] != 'p'
                        && words[i] != 'q'
                        && words[i] != 'r'
                        && words[i] != 's'
                        && words[i] != 't'
                        && words[i] != 'u'
                        && words[i] != 'v'
                        && words[i] != 'w'
                        && words[i] != 'x'
                        && words[i] != 'y'
                        && words[i] != 'z'
                        && words[i] != 'A'
                        && words[i] != 'B'
                        && words[i] != 'C'
                        && words[i] != 'D'
                        && words[i] != 'E'
                        && words[i] != 'F'
                        && words[i] != 'G'
                        && words[i] != 'H'
                        && words[i] != 'I'
                        && words[i] != 'J'
                        && words[i] != 'K'
                        && words[i] != 'L'
                        && words[i] != 'M'
                        && words[i] != 'N'
                        && words[i] != 'O'
                        && words[i] != 'P'
                        && words[i] != 'Q'
                        && words[i] != 'R'
                        && words[i] != 'S'
                        && words[i] != 'T'
                        && words[i] != 'U'
                        && words[i] != 'V'
                        && words[i] != 'W'
                        && words[i] != 'X'
                        && words[i] != 'Y'
                        && words[i] != 'Z') {
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
