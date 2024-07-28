import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String str = scanner.next();

            switch (str) {
                case "push":
                    queue.add(scanner.nextInt());
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.poll() + "\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        LinkedList<Integer> linkedList = (LinkedList<Integer>) queue;
                        sb.append(linkedList.getFirst() + "\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        LinkedList<Integer> linkedList = (LinkedList<Integer>) queue;
                        sb.append(linkedList.getLast() + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}