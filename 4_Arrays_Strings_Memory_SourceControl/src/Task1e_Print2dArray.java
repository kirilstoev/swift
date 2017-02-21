
public class Task1e_Print2dArray {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.printf("%4d", arr[col][row]);
            }
            System.out.println();
        }
        
                
        for (int row = 0; row < arr.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < arr.length; col++) {
                    System.out.printf("%4d", arr[col][row]);
                }
            } else {
                for (int col = arr.length-1; col >= 0; col--) {
                    System.out.printf("%4d", arr[col][row]);
                }
            }
            System.out.println();
        }
    }
}