package PeoplePresentation;


public class Worker extends Person {

    private double weekSalary;
    private int workHoursPerDay;
    private int workDaysPerWeek = 5;

    public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setWorkHoursPerDay(workHoursPerDay);
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary >= 0) {
            this.weekSalary = weekSalary;
        } else {
            System.out.println("Expected positive number for week salary.");
        }
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        if (workHoursPerDay >= 0) {
            this.workHoursPerDay = workHoursPerDay;
        } else {
            System.out.println("Expected positive number for work hours per day.");
        }
    }

    @Override
    void printInfo() {
        System.out.format("First name: %s%n"
                + "Last name: %s%n"
                + "Occupation: Worker%n"
                + "Week Salary: %s%n"
                + "Hours per day: %d%n"
                + "Salary per hour: %f%n"
                + "%n", getFirstName(), getLastName(), weekSalary, workHoursPerDay, weekSalary / workHoursPerDay / workDaysPerWeek);
    }
}
