public class Task7_SwapVariables {

    public static void main(String[] args) {
        
        int a= 5;
        int b= 9;
        
        int c = a;
        a = b;
        b = c;
        
        System.out.println(a);
        System.out.println(b);
        
        a= 5;
        b= 9;
        
        System.out.println(a);
        System.out.println(b);
        int d=a+b;
        
        a=d-a;
        b=d-b;
        
        System.out.println(a);
        System.out.println(b);
    }
    
}