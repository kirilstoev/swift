import java.util.Scanner;
public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i<=number; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        
        sum1=number*(number+1)/2;
        System.out.println(sum1);
    }
    
}
