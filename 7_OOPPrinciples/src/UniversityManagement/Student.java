package UniversityManagement;

public class Student extends Person {

    private String facultyNumber;
    private String[] objects;

    public Student(String name, String phone, String facultyNumber, String[] objects) {
        this.name = name;
        this.phone = phone;
        this.facultyNumber = facultyNumber;
        this.objects = objects;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit += limit;
    }

}
