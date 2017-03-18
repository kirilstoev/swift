package education;

import java.time.LocalDate;

public class SecondaryEducation extends GradedEducation {

    public SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, float finalGrade) {
        super(enrollmentDate, graduationDate, institutionName);
        super.finalGrade = finalGrade;
    }

    @Override
    public String getDegree() {
        return "Secondary";
    }

}
