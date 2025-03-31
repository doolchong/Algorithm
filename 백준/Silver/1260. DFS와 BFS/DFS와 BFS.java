import java.util.*;
import java.io.*;

public class Main {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    static StringBuilder sb = new StringBuilder();

    public void dfs(int v) {
        ch[v] = 1;
        sb.append(v + " ");

        for (int nv : graph.get(v)) {
            if (ch[nv] == 0) {
                dfs(nv);
            }
        }
    }

    public void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int curV = queue.poll();
            sb.append(curV + " ");

            for (int nv : graph.get(curV)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);
        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        main.dfs(v);
        sb.append("\n");
        ch = new int[n + 1];
        main.bfs(v);

        System.out.print(sb);
    }
}