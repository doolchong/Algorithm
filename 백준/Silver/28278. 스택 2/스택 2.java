import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int O = scanner.nextInt();
            switch (O) {
                case 1:
                    int X = scanner.nextInt();
                    stack.add(X);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(stack.pop() + "\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(stack.peek() + "\n");
                    }
                    break;
            }
        }

        System.out.println(sb);

    }
}