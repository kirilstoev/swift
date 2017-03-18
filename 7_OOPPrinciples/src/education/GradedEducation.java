package education;

import java.time.LocalDate;

public abstract class GradedEducation extends Education {

    float finalGrade;

    public GradedEducation(LocalDate enrollmentDate, LocalDate graduationDate, String institutionName) {
        super(enrollmentDate, graduationDate, institutionName);
        if (graduationDate.isBefore(LocalDate.now())) {
            gotGraduated();
        }
    }

    void gotGraduated() {
        super.graduated = true;
    }

    public float getFinalGrade() {
        if (super.graduated != true) {
            return -1;
        } else {
            return this.finalGrade;
        }
    }

}
