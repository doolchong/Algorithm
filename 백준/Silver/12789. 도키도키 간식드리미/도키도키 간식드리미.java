import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            queue.add(scanner.nextInt());
        }

        int cnt = 1;

        while (!queue.isEmpty()) {
            if (queue.peek() == cnt) {
                queue.poll();
                cnt++;
            } else if (!stack.isEmpty() && stack.peek() == cnt) {
                stack.pop();
                cnt++;
            } else {
                stack.add(queue.poll());
            }
        }
        
        while (!stack.isEmpty()) {
            if (stack.peek() == cnt) {
                stack.pop();
                cnt++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}