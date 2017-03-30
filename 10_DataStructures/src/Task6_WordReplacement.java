
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task6_WordReplacement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineSplit = line.split(" ");

        Map<String, String> replacement = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);;
        int rows = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < rows; i++) {
            String readRow = sc.nextLine();
            String[] splitRow = readRow.split(" ");
            replacement.put(splitRow[0], splitRow[1]);
        }

        for (int i = 0; i < lineSplit.length; i++) {
            if (replacement.containsKey(lineSplit[i])) {
                lineSplit[i] = replacement.get(lineSplit[i]);
            }
        }
        String result = "";
        for (String string : lineSplit) {
            result += string + " ";
        }
        System.out.println(result);
    }
}
