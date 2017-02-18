
public class Task3_IsAdult {

    public static void main(String[] args) {
        short age_0 = 12;
        short age_1 = 28;
        byte adult_age = 18;
        
        boolean isAdult_0 = (age_0>=adult_age);
        
        boolean isAdult_1 = (age_1>=adult_age);
        
        System.out.println("Is " + age_0 + " years old is an adult person: " + isAdult_0);   
        System.out.println("Is " + age_1 + " years old is an adult person: " + isAdult_1);   
    }
    
}
