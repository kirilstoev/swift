package PersonCharacteristics;

import java.time.LocalDate;

public class SecondaryEducation {

    float finalGrade;
    private boolean graduated;
    private LocalDate enrollmentDate;
    private LocalDate graduationDate;
    private String institutionName;

    public SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, float finalGrade) {
        this.finalGrade = finalGrade;
        this.graduated = graduated;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.institutionName = institutionName;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public float getFinalGrade() {
            return finalGrade;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setGradeGraduated(boolean graduated) {
        this.graduated = graduated;
    }

}
