import java.util.Scanner;
public class Task3c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        String evenNumbers="";
        while(numbers>0)
        {
            int value = sc.nextInt();
            if(value%2==0)
            {
                evenNumbers+=value+" ";
            }
            numbers--;
        }
            System.out.println(evenNumbers);
    }
}
