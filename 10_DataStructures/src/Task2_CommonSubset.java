
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task2_CommonSubset {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    String check = "";
    if (n<m){
    List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
    List<Integer> list2 = new ArrayList<>();
    for (int i = 0; i < m; i++) {
        int newNum = sc.nextInt();
            list2.add(newNum);
            if (list1.contains(newNum)){
                check += newNum+" ";
            }
        }
    }else{
    List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list1.add(sc.nextInt());
        }
    List<Integer> list2 = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        int newNum = sc.nextInt();
            list2.add(newNum);
            if (list1.contains(newNum)){
                check += newNum+" ";
            }
        }
    }
        System.out.println(check.isEmpty()?"NO":check);        
    }
}
