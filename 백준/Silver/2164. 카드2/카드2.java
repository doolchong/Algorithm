import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= N; i++) {
                queue.add(i);
            }

            while (true) {
                queue.poll();
                queue.add(queue.poll());
                if (queue.size() == 1) {
                    break;
                }
            }

            System.out.println(queue.poll());
        }
    }
}