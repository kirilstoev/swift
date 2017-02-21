
import java.util.Scanner;

public class Task5_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String finalResult = "";
        for (int i = 0; i < num; i++) {
            Scanner sc = new Scanner(System.in).useDelimiter(";");
            String firstName = sc.next();
            String surName = sc.next();
            char gender = sc.next().trim().charAt(0);
            int bornYear = sc.nextInt();
            double weight = sc.nextDouble();
            int height = sc.nextInt();
            String proffesion = sc.next();
            double rating = sc.nextDouble();
            double[] arr = new double[4];
            arr[0] = rating;
            rating = sc.nextDouble();
            arr[1] = rating;
            rating = sc.nextDouble();
            arr[2] = rating;
            rating = sc.nextDouble();
            arr[3] = rating;
            double average = 0;
            for (int j = 0; j < arr.length; j++) {
                average += arr[j];
            }
            average /= 4;
            if (gender == 'M') {
                if (2017 - bornYear >= 18) {
                    finalResult += firstName + " " + surName + " is " + (2017 - bornYear) + " years old. His weight is "
                            + weight + " and he is " + height + " cm tall. He is a " + proffesion + " with an average grade of " + average + ". " + System.lineSeparator();
                } else {
                    finalResult += firstName + " " + surName + " is " + (2017 - bornYear) + " years old. His weight is "
                            + weight + " and he is " + height + " cm tall. He is a " + proffesion + " with an average grade of " + average + ". " + firstName + " " + surName + " is under-aged." + System.lineSeparator();
                }
            } else {
                if (2017 - bornYear >= 18) {
                    finalResult += firstName + " " + surName + " is " + (2017 - bornYear) + " years old. Her weight is "
                            + weight + " and she is " + height + " cm tall. She is a " + proffesion + " with an average grade of " + average + ". " + System.lineSeparator();
                } else {
                    finalResult += firstName + " " + surName + " is " + (2017 - bornYear) + " years old. Her weight is "
                            + weight + " and she is " + height + " cm tall. She is a " + proffesion + " with an average grade of " + average + ". " + firstName + " " + surName + " is under-aged." + System.lineSeparator();
                }
            }
        }
            System.out.println(finalResult);
    }
}
