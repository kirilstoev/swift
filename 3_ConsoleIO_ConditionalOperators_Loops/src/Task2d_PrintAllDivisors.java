import java.util.Scanner;
public class Task2d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String deliteli = "";
        for (int i = 0; i<=number;i++){
            if (i>0 &&number%i==0)
            {
                deliteli += i + " ";
            }
        }
        System.out.println(deliteli);
    }
}
