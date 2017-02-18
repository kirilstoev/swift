public class Task1_ResultFromCodeFragment {

    public static void main(String[] args) {
    int a = 5;
    int b = 10; 
    //expected 60, because we will add 1 to a before execution
    //and after that we will multiply it by b and after that b 
    //will be increased with 1
    int c = ++a * b--;
    
    System.out.println(c);
    //expected result is 1+2=12
    System.out.println("1 + 2 = " + 1 + 2);
    //expected result is 1+2=3, because system will do the sum first
    //and after that will do the concatenation
    System.out.println("1 + 2 = " + (1 + 2));
    //expected result is 3abc because first we will do the sum and 
    //after that we will do the concatenation
    System.out.println(1 + 2 + "abc");
    //expected result is abc12 because we concatenate string and int
    System.out.println("abc" + 1 + 2);
    
    int x = 7; 
    float y = 5.6f; 
    float z = x * y; 
    //expected result is 39.239.2 because we are concatenate int 
    //and string and after that int again so we will do concatenation
    System.out.println(z + "" + (x * y) );
    
    }
    
}