
import java.util.Scanner;

public class Task3b_PrintSortedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int out;
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        int arr2[]=new int[arr.length];
        
        for (int j=0;j<arr.length;j++){
            for (int k=0;k<arr.length;k++){
             if (arr[j]>arr[k]){
                 idx++;
             }   
            }
            arr2[idx]=arr[j];
            idx = 0;
        }

        for (int number : arr2) {
            System.out.print(number+" ");
        }
    }
}
