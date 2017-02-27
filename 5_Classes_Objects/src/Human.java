
public class Human {

    private String firstName;
    private String surName;
    private char gender;
    private int bornYear;
    private double weight;
    private int height;
    private String proffesion;
    private double rating1;
    private double rating2;
    private double rating3;
    private double rating4;

    public Human(String firstName, String surName, char gender, int bornYear, double weight, int height, String proffesion, double rating1, double rating2, double rating3, double rating4) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.bornYear = bornYear;
        this.weight = weight;
        this.height = height;
        this.proffesion = proffesion;
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
        this.rating4 = rating4;
    }

    public int getBornYear() {
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

    public String getProffesion() {
        return proffesion;
    }

    public double getRating1() {
        return rating1;
    }

    public double getRating2() {
        return rating2;
    }

    public double getRating3() {
        return rating3;
    }

    public double getRating4() {
        return rating4;
    }

    public String getSurName() {
        return surName;
    }

    public double getWeight() {
        return weight;
    }

    public void setBornYear(int bornYear) {
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

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public void setRating1(double rating1) {
        this.rating1 = rating1;
    }

    public void setRating2(double rating2) {
        this.rating2 = rating2;
    }

    public void setRating3(double rating3) {
        this.rating3 = rating3;
    }

    public void setRating4(double rating4) {
        this.rating4 = rating4;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double getAverage(){
        return (this.rating1+this.rating2+this.rating3+this.rating4)/4;
    }
    
    int getAge(){
        return 2017 - this.bornYear;
    }

}
