package education;

import java.time.LocalDate;

public class PrimaryEducation extends Education {

    float finalGrade;

    public PrimaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate, float finalGrade) {
        super(enrollmentDate, graduationDate, institutionName);
        this.finalGrade=finalGrade;
    }

    public float getFinalGrade() {
        return finalGrade;
    }

    @Override
    public String getDegree() {
        return "Primary";
    }
    
    @Override
    public void gotGraduated(){
        this.graduated=true;
    } 

}
