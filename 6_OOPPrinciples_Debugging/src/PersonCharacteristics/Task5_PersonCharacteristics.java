package PersonCharacteristics;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

public class Task5_PersonCharacteristics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String scanNull = sc.nextLine();
        DateTimeFormatter format;
        Person[] newPerson = new Person[num];
        for (int i = 0; i < num; i++) {
            String scan = sc.nextLine();
            String[] person = scan.split("\\s*;\\s*");
            String[] bornDate = person[4].split("\\.");
            int bornDay = Integer.parseInt(bornDate[0]);
            int bornMonth = Integer.parseInt(bornDate[1]);
            int bornYear = Integer.parseInt(bornDate[2]);
            String[] startEducDate = person[6].split("\\.");
            int startEducDay = Integer.parseInt(startEducDate[0]);
            int startEducMonth = Integer.parseInt(startEducDate[1]);
            int startEducYear = Integer.parseInt(startEducDate[2]);
            String[] endEducDate = person[7].split("\\.");
            int endEducDay = Integer.parseInt(endEducDate[0]);
            int endEducMonth = Integer.parseInt(endEducDate[1]);
            int endEducYear = Integer.parseInt(endEducDate[2]);
            if (person.length == 8) {
                newPerson[i] = new Person(person[0], person[1], person[2].charAt(0), Integer.parseInt(person[3]), LocalDate.of(bornYear, bornMonth, bornDay), new SecondaryEducation(person[5], LocalDate.of(startEducYear, startEducMonth, startEducDay), LocalDate.of(endEducYear, endEducMonth, endEducDay), 0));
            } else {
                newPerson[i] = new Person(person[0], person[1], person[2].charAt(0), Integer.parseInt(person[3]), LocalDate.of(bornYear, bornMonth, bornDay), new SecondaryEducation(person[5], LocalDate.of(startEducYear, startEducMonth, startEducDay), LocalDate.of(endEducYear, endEducMonth, endEducDay), Float.parseFloat(person[8])));
            }
            format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            if (newPerson[i].getGender() == 'M') {
                if (newPerson[i].getAge() >= 18) {
                    if (DAYS.between(LocalDate.of(endEducYear, endEducMonth, endEducDay), LocalDate.now()) >= 0) {
                        System.out.format("%s %s is %d years old. He was born in %s. He started %s on %s and finished on %s with a grade of %f.%n", newPerson[i].getFirstName(), newPerson[i].getSurName(), newPerson[i].getAge(), newPerson[i].getBornYear().format(format), newPerson[i].education.getInstitutionName(), newPerson[i].education.getEnrollmentDate().format(format), newPerson[i].education.getGraduationDate().format(format), newPerson[i].education.getFinalGrade());
                    } else {
                        System.out.format("%s %s is %d years old. He was born in %s. He started %s on %s and is supposed to graduate on %s.%n", newPerson[i].getFirstName(), newPerson[i].getSurName(), newPerson[i].getAge(), newPerson[i].getBornYear().format(format), newPerson[i].education.getInstitutionName(), newPerson[i].education.getEnrollmentDate().format(format), newPerson[i].education.getGraduationDate().format(format));
                    }
                } else {
                    System.out.format("%s %s is %d years old. He was born in %s. He started %s on %s and is supposed to graduate on %s. %s %s is under-aged.%n", newPerson[i].getFirstName(), newPerson[i].getSurName(), newPerson[i].getAge(), newPerson[i].getBornYear().format(format), newPerson[i].education.getInstitutionName(), newPerson[i].education.getEnrollmentDate().format(format), newPerson[i].education.getGraduationDate().format(format), newPerson[i].getFirstName(), newPerson[i].getSurName());
                }
            } else {
                if (newPerson[i].getAge() >= 18) {
                    if (DAYS.between(LocalDate.of(endEducYear, endEducMonth, endEducDay), LocalDate.now()) >= 0) {
                        System.out.format("%s %s is %d years old. She was born in %s. She started %s on %s and finished on %s with a grade of %f.%n", newPerson[i].getFirstName(), newPerson[i].getSurName(), newPerson[i].getAge(), newPerson[i].getBornYear().format(format), newPerson[i].education.getInstitutionName(), newPerson[i].education.getEnrollmentDate().format(format), newPerson[i].education.getGraduationDate().format(format), newPerson[i].education.getFinalGrade());
                    } else {
                        System.out.format("%s %s is %d years old. She was born in %s. She started %s on %s and is supposed to graduate on %s.%n", newPerson[i].getFirstName(), newPerson[i].getSurName(), newPerson[i].getAge(), newPerson[i].getBornYear().format(format), newPerson[i].education.getInstitutionName(), newPerson[i].education.getEnrollmentDate().format(format), newPerson[i].education.getGraduationDate().format(format));
                    }
                } else {
                    System.out.format("%s %s is %d years old. She was born in %s. She started %s on %s and is supposed to graduate on %s. %s %s is under-aged.%n", newPerson[i].getFirstName(), newPerson[i].getSurName(), newPerson[i].getAge(), newPerson[i].getBornYear().format(format), newPerson[i].education.getInstitutionName(), newPerson[i].education.getEnrollmentDate().format(format), newPerson[i].education.getGraduationDate().format(format), newPerson[i].getFirstName(), newPerson[i].getSurName());
                }
            }
        }
    }
}
