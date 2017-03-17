package PeoplePresentation;


import java.util.Scanner;


public class Task1_PeoplePresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doWhile = "";
        do {
            String row = sc.nextLine();
            String[] newRow = row.split(" ");
            doWhile = newRow[0];
            if (!newRow[0].equals("END")) {
                if(newRow.length==5){
                    //Student
                    Student student = new Student(newRow[0],newRow[1],newRow[2],newRow[3],newRow[4]);
                    student.printInfo();
                }else{
                    //Worker
                    Worker worker = new Worker(newRow[0],newRow[1],Double.parseDouble(newRow[2]),Integer.parseInt(newRow[3]));
                    worker.printInfo();
                }
            } 
        } while (!doWhile.equals("END"));
    }
}
