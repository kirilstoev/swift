package education;

import java.time.LocalDate;

public abstract class Education {

    boolean graduated;
    private final LocalDate enrollmentDate;
    public LocalDate graduationDate;
    private final String institutionName;

    public Education(LocalDate enrollmentDate, LocalDate graduationDate, String institutionName) {
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.institutionName = institutionName;
    }

    public abstract String getDegree();

    abstract void gotGraduated();

    public boolean isGraduated() {
        return graduated;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }
    
    public void setGraduationDate(LocalDate date){
        this.graduationDate=date;
    }
}
