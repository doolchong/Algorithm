import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> linkedList = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            linkedList.add(i);
        }

        int i = K - 1;
        System.out.print("<");
        while (linkedList.size() != 1) {
            System.out.print(linkedList.remove(i) + ", ");
            i += (K - 1);
            i %= linkedList.size();
        }
        System.out.print(linkedList.poll());
        System.out.println(">");
    }
}