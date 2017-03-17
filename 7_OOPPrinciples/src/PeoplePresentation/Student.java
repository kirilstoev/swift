package PeoplePresentation;


public class Student extends Person {

    private String facultyNumber;
    private int lectureCount;
    private int exerciseCount;
    final int lectureDuration = 2;
    final double exerciseDuration = 1.5;
    final int workDaysPerWeek = 5;

    public Student(String firstName, String lastName, String facultyNumber, String lectureCount, String exerciseCount) {
        super(firstName, lastName); //извикване на класа на главният клас
        setFacultyNumber(facultyNumber);
        setLectureCount(lectureCount);
        setExerciseCount(exerciseCount);
    }

    public void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() >= 5 && facultyNumber.length() <= 10) {
            this.facultyNumber = facultyNumber;
        } else {
            System.out.println("Expected length for faculty number is between 5 and 10 symbols.");
        }
    }

    public void setLectureCount(String lectureCount) {
        if (isInteger(lectureCount) == true) {
            if (Integer.parseInt(lectureCount) >= 0) {
                this.lectureCount = Integer.parseInt(lectureCount);
            } else {
                System.out.println("Expected positive number for lecture count.");
            }
        } else {
            System.out.println("Expected integer for lecture count.");
        }
    }

    public void setExerciseCount(String exerciseCount) {
        if (isInteger(exerciseCount) == true) {
            if (Integer.parseInt(exerciseCount) >= 0) {
                this.exerciseCount = Integer.parseInt(exerciseCount);
            } else {
                System.out.println("Expected positive number for exercise count.");
            }
        } else {
            System.out.println("Expected integer for exercise count.");
        }
    }

    public boolean isInteger(String number) {
        boolean check = true;
        String[] numbers = number.split("\\.");
        if (numbers.length > 1) {
            if (Integer.parseInt(numbers[1]) > 0) {
                check = false;
            }
        }
        return check;
    }

    @Override
    void printInfo() {
        System.out.format("First name: %s%n"
                + "Last name: %s%n"
                + "Occupation: Student%n"
                + "Faculty number: %s%n"
                + "Hours per day: %f%n"
                + "%n", getFirstName(), getLastName(), facultyNumber, (lectureCount * lectureDuration + exerciseCount * exerciseDuration) / workDaysPerWeek);
    }
}
