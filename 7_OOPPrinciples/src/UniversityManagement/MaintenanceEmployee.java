package UniversityManagement;

public class MaintenanceEmployee extends Employee {

    double salaryPerHour = 15;
    double salary = 0;

    public MaintenanceEmployee(String name, String phone) {
        this.name = name;
        this.phone = phone;
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
