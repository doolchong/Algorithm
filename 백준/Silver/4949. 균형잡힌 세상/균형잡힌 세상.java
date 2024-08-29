import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = scanner.nextLine();
            if (str.equals(".")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.add(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        stack.add(str.charAt(i));
                    } else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            stack.add(str.charAt(i));
                        }
                    }
                } else if (str.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        stack.add(str.charAt(i));
                    } else {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.add(str.charAt(i));
                        }
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}