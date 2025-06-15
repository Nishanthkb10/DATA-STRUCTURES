/*Stack implementation that gets input and checks with condition
and Validate it with respective to opening and closing Brackets
Input : ({}[][()])   Output : Yes
Input : {()[]{()}}}  Output : No
*/

import java.util.Scanner;
import java.util.Stack;

public class Brackets_Validation {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total entries: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int num=i+1;
            System.out.println("Enter Your String "+num+": ");
            String val = sc.nextLine();
            if (isValid(val)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
