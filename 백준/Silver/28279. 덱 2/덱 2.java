import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            switch (n) {
                case 1:
                    int X1 = Integer.parseInt(st.nextToken());
                    queue.addFirst(X1);
                    break;
                case 2:
                    int X2 = Integer.parseInt(st.nextToken());
                    queue.addLast(X2);
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.pollFirst() + "\n");
                    }
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.pollLast() + "\n");
                    }
                    break;
                case 5:
                    sb.append(queue.size() + "\n");
                    break;
                case 6:
                    if (queue.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case 7:
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.getFirst() + "\n");
                    }
                    break;
                case 8:
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.getLast() + "\n");
                    }
            }
        }
        System.out.println(sb);
    }
}