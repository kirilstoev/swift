
import java.util.Scanner;

public class Task3_DateDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date1 = sc.nextLine();
        int year = Integer.parseInt(date1.substring(0, 4));
        int month = Integer.parseInt(date1.substring(5, 7));
        int day = Integer.parseInt(date1.substring(8, 10));

        String date2 = sc.nextLine();
        int yearNew = Integer.parseInt(date2.substring(0, 4));
        int monthNew = Integer.parseInt(date2.substring(5, 7));
        int dayNew = Integer.parseInt(date2.substring(8, 10));

        SwiftDate year1 = new SwiftDate(year, month, day);
        SwiftDate year2 = new SwiftDate(yearNew, monthNew, dayNew);

        System.out.println(year1.getDaysDifference(yearNew, monthNew, dayNew));
        System.out.println(year1.getInfo());
        System.out.println(year2.getInfo());

    }
}
