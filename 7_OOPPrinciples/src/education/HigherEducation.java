package education;

import java.time.LocalDate;

public class HigherEducation extends GradedEducation {

    String degree;

    public HigherEducation(String degree, String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, float finalGrade) {
        super(enrollmentDate, graduationDate, institutionName);
        super.finalGrade=finalGrade;
        setDegree(degree);
    }

    public void setDegree(String degree) {
        switch (degree) {
            case "B":
                this.degree = "bachelor";
                break;
            case "M":
                this.degree = "master";
                break;
            case "D":
                this.degree = "doctorate";
                break;
            default:
                break;
        }
    }

    public String getDegree() {
        return this.degree;
    }

}
