
import java.util.Scanner;

public class Task1a_Printing {

    static void Printing(String name, int age) {
        System.out.format("%s is %d years old.%n", name, age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        Printing(name, age);
    }
}
