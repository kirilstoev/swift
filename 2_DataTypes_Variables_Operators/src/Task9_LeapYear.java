public class Task9_LeapYear {

    public static void main(String[] args) {
        short year = 2016;

        boolean leapYear = year%400==0||(year%100!=0&&year%4==0);
        
        System.out.println("Is " + year + " year is leap year: " + leapYear);
    }
    
}
