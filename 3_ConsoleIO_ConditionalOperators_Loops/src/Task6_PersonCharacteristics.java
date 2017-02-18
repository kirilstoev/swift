
import java.util.Scanner;

public class Task6_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        int bornYear;
        float weight;
        int height;
        String finalResult = "";

        for (int i = 0; i < persons; i++) {
            System.out.print("Enter your first name:");
            String firstName = sc.next();
            System.out.print("Enter your surname:");
            String surName = sc.next();
            do {
                System.out.print("Enter your born year:");
                bornYear = sc.nextInt();
            } while (bornYear <= 1880 || bornYear >= 2017);
            do {
                System.out.print("Enter your weight:");
                weight = sc.nextFloat();
            } while (weight <= 0 || weight >= 250);
            do {
                System.out.print("Enter your height:");
                height = sc.nextInt();
            } while (height <= 0 || height >= 250);
            System.out.print("Enter your proffesion:");
            String proffesion = sc.next();
            if (2017-bornYear>=18){
            finalResult += firstName + " " + surName + " is " + (2017 - bornYear) + " years old. His weight is "
                    + weight + " and he is " + height + " cm tall. He is a " + proffesion + "." + System.lineSeparator();
            }else{
            finalResult+= firstName + " " + surName + " is " + (2017 - bornYear) + " years old. His weight is "
                    + weight + " and he is " + height + " cm tall. He is a " + proffesion + ". " + firstName + " " + surName + " is under-aged." + System.lineSeparator();
            }
        }
        System.out.println(finalResult);
    }
}

