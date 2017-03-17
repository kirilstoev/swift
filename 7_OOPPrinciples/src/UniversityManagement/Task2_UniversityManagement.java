package UniversityManagement;

import java.util.Scanner;

public class Task2_UniversityManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doWhile = "";
        Person[] persons = new Person[500];
        int count = 0;
        double universityBalance = 500;
        do {
            String row = sc.nextLine();
            String[] newRow = row.split(" ");
            doWhile = newRow[0];
            if (!newRow[0].equals("END")) {
                switch (newRow[0]) {
                    case "NEW":
                        switch (newRow[1]) {
                            case "MAINT":
                                persons[0] = new MaintenanceEmployee(newRow[2], newRow[3]);
                                count++;
                                break;
                            case "ADMIN":
                                String[] adminObjects = new String[newRow.length - 4];
                                for (int i = 0; i < newRow.length - 4; i++) {
                                    adminObjects[i] = newRow[4 + i];
                                }
                                persons[count] = new AdministrationEmployee(newRow[2], newRow[3], adminObjects);
                                count++;
                                break;
                            case "TEACH":
                                String[] teachObjects = new String[newRow.length - 4];
                                for (int i = 0; i < newRow.length - 4; i++) {
                                    teachObjects[i] = newRow[4 + i];
                                }
                                persons[count] = new Teacher(newRow[2], newRow[3], teachObjects);
                                count++;
                                break;
                            case "STUD":
                                String[] studentObject = new String[newRow.length - 5];
                                for (int i = 0; i < newRow.length - 5; i++) {
                                    studentObject[i] = newRow[5 + i];
                                }
                                persons[count] = new Student(newRow[2], newRow[3], newRow[4], studentObject);
                                count++;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "WORK":
                        for (int i = 0; i < count; i++) {
                            if (persons[i] instanceof Teacher) {
                                Teacher teachers = (Teacher) persons[i];
                                if (teachers.getName().equals(newRow[1])) {
                                    universityBalance -= teachers.getSalaryPerHour();
                                    if (universityBalance <= 0) {
                                        System.out.println("Bankrupcy.");
                                        System.exit(0);
                                    }
                                    teachers.setSalary();
                                    for (int j = 0; j < count; j++) {
                                        if (persons[j] instanceof Student) {
                                            Student students = (Student) persons[j];
                                            students.setLimit(3);
                                            if (students.getLimit() >= 50) {
                                                universityBalance += 10;
                                            }
                                            if (students.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", students.getName());
                                                System.exit(0);
                                            }
                                        }else if (persons[j] instanceof AdministrationEmployee) {
                                            AdministrationEmployee adminEmpl = (AdministrationEmployee) persons[j];
                                            adminEmpl.setLimit(-1);
                                            if (adminEmpl.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", adminEmpl.getName());
                                                System.exit(0);
                                            }
                                        }else if (persons[j] instanceof MaintenanceEmployee) {
                                            MaintenanceEmployee maintEmpl = (MaintenanceEmployee) persons[j];
                                            maintEmpl.setLimit(-3);
                                            if (maintEmpl.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", maintEmpl.getName());
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    break;
                                }
                            } else if (persons[i] instanceof AdministrationEmployee) {
                                AdministrationEmployee adminEmpl = (AdministrationEmployee) persons[i];
                                if (adminEmpl.getName().equals(newRow[1])) {
                                    universityBalance -= adminEmpl.getSalaryPerHour();
                                    if (universityBalance <= 0) {
                                        System.out.println("Bankrupcy.");
                                        System.exit(0);
                                    }
                                    adminEmpl.setSalary();
                                    for (int j = 0; j < count; j++) {
                                        if (persons[j] instanceof Student) {
                                            Student students = (Student) persons[j];
                                            students.setLimit(3);
                                            if (students.getLimit() >= 50) {
                                                universityBalance += 10;
                                            }
                                            if (students.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", students.getName());
                                                System.exit(0);
                                            }
                                        }
                                        if (persons[j] instanceof Teacher) {
                                            Teacher teachers = (Teacher) persons[j];
                                            teachers.setLimit(3);
                                            if (teachers.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", teachers.getName());
                                                System.exit(0);
                                            }
                                        }
                                        if (persons[j] instanceof MaintenanceEmployee) {
                                            MaintenanceEmployee maintEmpl = (MaintenanceEmployee) persons[j];
                                            maintEmpl.setLimit(1);
                                            if (maintEmpl.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", maintEmpl.getName());
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    break;
                                }
                            } else if (persons[i] instanceof MaintenanceEmployee) {
                                MaintenanceEmployee maintEmpl = (MaintenanceEmployee) persons[i];
                                if (maintEmpl.getName().equals(newRow[1])) {
                                    universityBalance -= maintEmpl.getSalaryPerHour();
                                    if (universityBalance <= 0) {
                                        System.out.println("Bankrupcy.");
                                        System.exit(0);
                                    }
                                    maintEmpl.setSalary();
                                    for (int j = 0; j < count; j++) {
                                        if (persons[j] instanceof Student) {
                                            Student students = (Student) persons[j];
                                            students.setLimit(2);
                                            if (students.getLimit() >= 50) {
                                                universityBalance += 10;
                                            }
                                            if (students.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", students.getName());
                                                System.exit(0);
                                            }
                                        }
                                        if (persons[j] instanceof Teacher) {
                                            Teacher teachers = (Teacher) persons[j];
                                            teachers.setLimit(2);
                                            if (teachers.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", teachers.getName());
                                                System.exit(0);
                                            }
                                        }
                                        if (persons[j] instanceof AdministrationEmployee) {
                                            AdministrationEmployee adminEmpl = (AdministrationEmployee) persons[j];
                                            adminEmpl.setLimit(2);
                                            if (adminEmpl.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", adminEmpl.getName());
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    break;
                                }
                            }else if (persons[i] instanceof Student) {
                                Student students = (Student) persons[i];
                                if (students.getName().equals(newRow[1])) {
                                    students.setLimit(2);
                                    if (students.getLimit() >= 50) {
                                        universityBalance += 10;
                                    }
                                    for (int j = 0; j < count; j++) {
                                        if (persons[j] instanceof MaintenanceEmployee) {
                                            MaintenanceEmployee maintEmpl = (MaintenanceEmployee) persons[j];
                                            maintEmpl.setLimit(-1);
                                            if (maintEmpl.getLimit() <= 0) {
                                                System.out.format("%s is not happy.", maintEmpl.getName());
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    case "IDLE":
                        for (int i = 0; i < count; i++) {
                            if (persons[i] instanceof Student) {
                                Student students = (Student) persons[i];
                                students.setLimit(-5);
                                if (students.getLimit() >= 50) {
                                    universityBalance += 10;
                                }
                                if (students.getLimit() <= 0) {
                                    System.out.format("%s is not happy.", students.getName());
                                    System.exit(0);
                                }
                            }else if (persons[i] instanceof Teacher) {
                                Teacher teachers = (Teacher) persons[i];
                                teachers.setLimit(-5);
                                if (teachers.getLimit() <= 0) {
                                    System.out.format("%s is not happy.", teachers.getName());
                                    System.exit(0);
                                }
                            }else if (persons[i] instanceof MaintenanceEmployee) {
                                MaintenanceEmployee maintEmpl = (MaintenanceEmployee) persons[i];
                                maintEmpl.setLimit(-5);
                                if (maintEmpl.getLimit() <= 0) {
                                    System.out.format("%s is not happy.", maintEmpl.getName());
                                    System.exit(0);
                                }
                            }else if (persons[i] instanceof AdministrationEmployee) {
                                AdministrationEmployee adminEmpl = (AdministrationEmployee) persons[i];
                                adminEmpl.setLimit(-5);
                                if (adminEmpl.getLimit() <= 0) {
                                    System.out.format("%s is not happy.", adminEmpl.getName());
                                    System.exit(0);
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }
            } else {
                for (int i = 0; i < count; i++) {
                    if (persons[i] instanceof Student) {
                        Student students = (Student) persons[i];
                        System.out.format("%s - %d", students.getName(), students.getLimit());
                    }else if (persons[i] instanceof Teacher) {
                        Teacher teachers = (Teacher) persons[i];
                        System.out.format("%s - %d", teachers.getName(), teachers.getLimit());
                    }else if (persons[i] instanceof MaintenanceEmployee) {
                        MaintenanceEmployee maintEmpl = (MaintenanceEmployee) persons[i];
                        System.out.format("%s - %d", maintEmpl.getName(), maintEmpl.getLimit());
                    }else if (persons[i] instanceof AdministrationEmployee) {
                        AdministrationEmployee adminEmpl = (AdministrationEmployee) persons[i];
                        System.out.format("%s - %d", adminEmpl.getName(), adminEmpl.getLimit());
                    }
                }
            }
        } while (!doWhile.equals("END"));
    }

}
