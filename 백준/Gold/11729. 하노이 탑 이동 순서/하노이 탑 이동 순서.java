import java.util.*;
import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public void hanoi(int n, int from, int aux, int to) {
        if (n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }
        hanoi(n - 1, from, to, aux);
        sb.append(from + " " + to + "\n");
        hanoi(n - 1, aux, from, to);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            cnt *= 2;
        }

        System.out.println(cnt - 1);

        main.hanoi(n, 1, 2, 3);

        System.out.println(sb);
    }
}