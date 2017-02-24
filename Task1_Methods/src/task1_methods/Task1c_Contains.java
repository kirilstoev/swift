
import java.util.Scanner;

public class Task1c_Contains {

    static void Contains(int[] arr, int number) {
        int idx=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                idx=i;
            }
            else{
                idx=-1;
            }
        }
        System.out.println(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        Contains(arr, number);
    }
}
