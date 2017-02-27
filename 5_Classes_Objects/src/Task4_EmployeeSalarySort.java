
import java.util.Scanner;

public class Task4_EmployeeSalarySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String blank = sc.nextLine();
        String readRow;
        Employee[] employees = new Employee[number];
        for (int i = 0; i < number; i++) {
            readRow = sc.nextLine();
            String newPerson[] = readRow.split("\\s*,\\s*");

            switch (newPerson.length) {
                case 6:
                    employees[i] = new Employee(newPerson[0], Double.parseDouble(newPerson[1]), newPerson[2], newPerson[3], Integer.parseInt(newPerson[4]), newPerson[5]);
                    break;

                case 5:
                    if (newPerson[4].chars().allMatch( Character::isDigit )) {
                        employees[i] = new Employee(newPerson[0], Double.parseDouble(newPerson[1]), newPerson[2], newPerson[3], Integer.parseInt(newPerson[4]));
                        break;
                    } else {
                        employees[i] = new Employee(newPerson[0], Double.parseDouble(newPerson[1]), newPerson[2], newPerson[3], newPerson[4]);
                    }
                case 4:
                    employees[i] = new Employee(newPerson[0], Double.parseDouble(newPerson[1]), newPerson[2], newPerson[3]);
                    break;
                default:
                    break;
            }
        }
        for (int i = 1; i < number; i++) {
            if (employees[i - 1].getSalary() < employees[i].getSalary()) {
                for (int j = i-1; j >= 0; j--) {
                    if (employees[j].getSalary() < employees[j+1].getSalary()) {
                        Employee[] emplTmpl = new Employee[1];
                        emplTmpl[0] = employees[j+1];
                        employees[j+1] = employees[j];
                        employees[j] = emplTmpl[0];
                    }
                }
            }
        }
        for(int k=0;k<3;k++) {
            if(employees[k].getEmail()==null){
            System.out.format("%s, %s, %s%n", employees[k].getName(), employees[k].getDepartment(), employees[k].getPosition());
            }else{
            System.out.format("%s, %s, %s, %s%n", employees[k].getName(), employees[k].getDepartment(), employees[k].getPosition(), employees[k].getEmail());    
            }
        }
    }
}
