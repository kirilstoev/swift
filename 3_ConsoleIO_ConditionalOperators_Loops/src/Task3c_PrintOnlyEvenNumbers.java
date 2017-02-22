import java.util.Scanner;
public class Task3c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        String evenNumbers="";
        for(int i=0;i<numbers;i++)
        {
            int value = sc.nextInt();
            if(value%2==0)
            {
                evenNumbers+=value+" ";
            }
        }
        System.out.println(evenNumbers);
    }
}
