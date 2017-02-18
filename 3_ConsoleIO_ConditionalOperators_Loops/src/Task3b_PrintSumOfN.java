import java.util.Scanner;

public class Task3b_PrintSumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int sum=0;
        for (int i=0;i<numbers;i++)
        {
         int value = sc.nextInt();
         sum+=value;
        }
        System.out.println(sum);
    }
    
}
