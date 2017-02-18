
import java.util.Scanner;

public class Task1e_ReadNNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        while (rows>0)
        {
            int numbers = sc.nextInt();
            System.out.println(numbers);
            rows--;
        }
    }
}
