
package UniversityManagement;

public class Teacher extends Employee{
    String[] objects;
    double salaryPerHour = 25;
    double salary=0;

    public Teacher(String name, String phone, String[] objects) {
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
