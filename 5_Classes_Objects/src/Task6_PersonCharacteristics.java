
import java.util.Scanner;

public class Task6_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String scanNull = sc.nextLine();
        for (int i = 0; i < num; i++) {
            String scan = sc.nextLine();
            String[] person = scan.split("\\s*,\\s*");  
            Human newHuman = new Human(person[0],person[1],person[2].charAt(0),Integer.parseInt(person[3]),Double.parseDouble(person[4]),Integer.parseInt(person[5]),person[6],Double.parseDouble(person[7]),Double.parseDouble(person[8]),Double.parseDouble(person[9]),Double.parseDouble(person[10]));
            
            if (newHuman.getGender() == 'M') {
                if (newHuman.getAge() >= 18) {
                    System.out.format("%s %s is %d years old. His weight is %f and he is %d cm tall. He is a %s with an average grade of %f.%n",newHuman.getFirstName(),newHuman.getSurName(),newHuman.getAge(),newHuman.getWeight(),newHuman.getHeight(),newHuman.getProffesion(),newHuman.getAverage());
                } else {
                    System.out.format("%s %s is %d years old. His weight is %f and he is %d cm tall. He is a %s with an average grade of %f. %s %s is under-aged.%n",newHuman.getFirstName(),newHuman.getSurName(),newHuman.getAge(),newHuman.getWeight(),newHuman.getHeight(),newHuman.getProffesion(),newHuman.getAverage(),newHuman.getFirstName(),newHuman.getSurName()); 
                }
            } else {
                if (newHuman.getAge() >= 18) {
                    System.out.format("%s %s is %d years old. Her weight is %f and she is %d cm tall. She is a %s with an average grade of %f.%n",newHuman.getFirstName(),newHuman.getSurName(),newHuman.getAge(),newHuman.getWeight(),newHuman.getHeight(),newHuman.getProffesion(),newHuman.getAverage());
                } else {
                    System.out.format("%s %s is %d years old. Her weight is %f and she is %d cm tall. She is a %s with an average grade of %f. %s %s is under-aged.%n",newHuman.getFirstName(),newHuman.getSurName(),newHuman.getAge(),newHuman.getWeight(),newHuman.getHeight(),newHuman.getProffesion(),newHuman.getAverage(),newHuman.getFirstName(),newHuman.getSurName()); 
                }
            }
        }
    }
}
