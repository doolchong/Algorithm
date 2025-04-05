import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static boolean[] visited;

    public void dfs(int l, int n, int m) {
        if (l == m) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[l] = i + 1;
                dfs(l + 1, n, m);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        arr = new int[m];
        visited = new boolean[n];
        main.dfs(0, n, m);
    }
}