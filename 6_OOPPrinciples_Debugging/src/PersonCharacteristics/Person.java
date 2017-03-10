package PersonCharacteristics;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.Date;

public class Person {

    private String firstName;
    private String surName;
    private char gender;
    private LocalDate bornYear;
    private int height;
    SecondaryEducation education;

    public Person(String firstName, String surName, char gender, int height, LocalDate bornYear, SecondaryEducation education) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.bornYear = bornYear;
        this.height = height;
        this.education = education;
    }

    public LocalDate getBornYear() {
        return bornYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public String getSurName() {
        return surName;
    }

    public void setBornYear(LocalDate bornYear) {
        this.bornYear = bornYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public long getAge() {
        long yearsBetween = YEARS.between(this.bornYear, LocalDate.now());
        return yearsBetween;
    }

}
