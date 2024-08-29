import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int K = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int N = scanner.nextInt();
            if (N == 0) {
                stack.pop();
            } else {
                stack.add(N);
            }
        }

        for (Integer integer : stack) {
            sum += integer;
        }

        System.out.println(sum);

    }
}