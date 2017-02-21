import java.util.Arrays;
import java.util.Scanner;
public class Task4a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char arr[] = word.toCharArray();
        char arrNew[] = new char[arr.length];
        for (int i=0;i<arr.length;i++){
            arrNew[arr.length-i-1]=arr[i];
        }
        System.out.println(Arrays.equals(arr, arrNew));
    }
}
