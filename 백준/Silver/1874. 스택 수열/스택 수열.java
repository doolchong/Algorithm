import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        boolean check = true;
        int n = scanner.nextInt();
        int[] A = new int[n];
        int num = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (A[i] >= num) {
                while (A[i] >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int m = stack.pop();
                if (m > A[i]) {
                    check = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }

        if (!check) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}