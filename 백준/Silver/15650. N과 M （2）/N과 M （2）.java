import java.util.*;
import java.io.*;

public class Main {

    static int n, m;
    static int[] arr;
    static boolean[] ch;
    static StringBuilder sb = new StringBuilder();

    public void dfs(int l, int v) {
        if (l == m) {
            for (int num : arr) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = v; i < n; i++) {
            if (!ch[i]) {
                ch[i] = true;
                arr[l] = i + 1;
                dfs(l + 1, i + 1);
                ch[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        ch = new boolean[n];
        arr = new int[m];

        main.dfs(0, 0);

        System.out.print(sb);
    }
}