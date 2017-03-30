
import java.util.Scanner;

public class Task8_Snake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String snake = "ooooo";
        int length = 20;
        int heigh = 60;
        String[][] field = new String[length + 2][heigh + 2];
        for (int i = 0; i < length + 2; i++) {
            for (int j = 0; j < heigh + 2; j++) {
                if (i == 0 || i == length + 1) {
                    field[i][j] = "#";
                    System.out.print(field[i][j]);
                } else {
                    if (j == 0 || j == heigh + 1) {
                        field[i][j] = "#";
                        System.out.print(field[i][j]);
                    } else {
                        field[i][j] = " ";
                        System.out.print(field[i][j]);
                    }
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 20; i++) {
            field[i][i + 1] = "o";
            field[i][i + 2] = "o";
            field[i][i + 3] = "o";
            field[i][i + 4] = "o";
            field[i][i + 5] = "o";
            for (int j = 0; j < length + 2; j++) {
                for (int k = 0; k < heigh + 2; k++) {
                    System.out.print(field[i][j]);
                }
                System.out.println("");
            }
        }

        /*for (int i = 0; i < length + 2; i++) {
            for (int j = 0; j < heigh + 2; j++) {
String ESC = "\033[";
System.out.print(ESC + "2J"); 
            }
            System.out.println("");
        }*/
    }
}
