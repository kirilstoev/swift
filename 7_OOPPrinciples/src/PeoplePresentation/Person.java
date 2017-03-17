package PeoplePresentation;


import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public abstract class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 2 && firstName.length() <= 30) {
            if (isPureAscii(firstName)) {
                if (firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'Z') {
                    this.firstName = firstName;
                } else {
                    System.out.println("Expected upper case letter at first position of first name.");
                }
            } else {
                System.out.println("Expected only Latin letters in first name.");
                System.exit(0);
            }
        } else {
            System.out.println("Expected length for first name is between 2 and 30 symbols.");
            System.exit(0);
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 2 && lastName.length() <= 30) {
            if (isPureAscii(lastName)) {
                if (lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'Z') {
                    this.lastName = lastName;
                } else {
                    System.out.println("Expected upper case letter at first position of last name.");
                    System.exit(0);
                }
            } else {
                System.out.println("Expected only Latin letters in last name.");
                System.exit(0);
            }
        } else {
            System.out.println("Expected length for last name is between 2 and 30 symbols.");
            System.exit(0);
        }
    }

    abstract void printInfo();

    static CharsetEncoder asciiEncoder = Charset.forName("ISO-8859-1").newEncoder(); // "US-ASCII" or "ISO-8859-1" for ISO Latin 1

    public static boolean isPureAscii(String str) {
        return asciiEncoder.canEncode(str);
    }
}
