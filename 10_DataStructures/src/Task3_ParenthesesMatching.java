
import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result = "true";
        String line = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        char[] arr = line.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.add(arr[i]);
            } else if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
                if (arr[i] == ')') {
                    if (!stack.pop().equals('(')) {
                        result = "false";
                        break;
                    }
                } else if (arr[i] == ']') {
                    if (!stack.pop().equals('[')) {
                        result = "false";
                        break;
                    } 
                } else if (arr[i] == '}') {
                    if (!stack.pop().equals('{')) {
                        result = "false";
                        break;
                    } 
                }
            }
        }
        System.out.println(result);
    }
}
