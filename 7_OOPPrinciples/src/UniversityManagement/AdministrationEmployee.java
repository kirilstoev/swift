package UniversityManagement;

public class AdministrationEmployee extends Employee {

    String[] objects;
    double salaryPerHour = 19;
    double salary = 0;

    public AdministrationEmployee(String name, String phone, String[] objects) {
        this.name = name;
        this.phone = phone;
        this.objects = objects;
    }

    public String getName() {
        return name;
    }

    public void setSalary() {
        this.salary += salaryPerHour;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit += limit;
    }
}
