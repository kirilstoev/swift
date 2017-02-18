
import java.util.Scanner;

public class Task2i_ToBinaryAndHexa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int hexnum = number;
        String convert = "";
        String binOut = "";
        String hexOut = "";
        do {
            binOut = number % 2 + binOut;
            number /= 2;
        } while (number > 0);
        do {
            if (hexnum % 16 > 9) {
                switch (hexnum % 16) {
                    case 10:
                        convert = "A";
                        break;
                    case 11:
                        convert = "B";
                        break;
                    case 12:
                        convert = "C";
                        break;
                    case 13:
                        convert = "D";
                        break;
                    case 14:
                        convert = "E";
                        break;
                    case 15:
                        convert = "F";
                        break;
                }
                hexOut = convert + hexOut;
                hexnum /= 16;
            } else {
                hexOut = hexnum % 16 + hexOut;
                hexnum /= 16;
            }
        } while (hexnum > 0);
        System.out.println(binOut);
        System.out.println(hexOut);
    }

}
