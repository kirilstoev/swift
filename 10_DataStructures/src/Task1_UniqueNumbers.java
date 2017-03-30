
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueNumbers.add(sc.nextInt());
        }
    for(Integer i: uniqueNumbers){
        System.out.print(i+" ");
    }
        
    }
}
