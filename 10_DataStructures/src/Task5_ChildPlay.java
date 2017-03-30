
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_ChildPlay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rounds = -1;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        boolean check = false;
        do {
            check = false;
            for (int i = arrayList.size() - 2; i >= 0; i--) {
                if (arrayList.get(i + 1) > arrayList.get(i)) {
                    arrayList.remove(i + 1);
                    check = true;
                }
            }
            rounds++;
        } while (check != false);
        System.out.println(rounds);
    }
}
