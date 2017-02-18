import java.util.Scanner;

public class Task3d_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String reverseNumbers = "";
        while (number >0){
            int value = sc.nextInt();
            reverseNumbers=value+" "+reverseNumbers;
            number--;
        }
        System.out.println(reverseNumbers);
    }
    
}
