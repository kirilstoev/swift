import java.util.Scanner;
public class Task3a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int out= Integer.MIN_VALUE;
        for (int i=0; i<num;i++){
            int number = sc.nextInt();
            if (number>out){
                out = number;
            }
        }
        System.out.println(out);
    }
}
