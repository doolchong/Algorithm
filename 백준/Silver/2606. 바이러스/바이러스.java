import java.util.*;

public class Main {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void dfs(int v) {
        Main main = new Main();

        for (int i = 0; i < graph.get(v).size(); i++) {
            if (ch[graph.get(v).get(i)] == 1) {
                continue;
            }

            ch[graph.get(v).get(i)] = 1;
            main.dfs(graph.get(v).get(i));
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        ch = new int[n + 1];

        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        main.dfs(1);

        ch[1] = 1;

        for (int v : ch) {
            if (v == 1) {
                answer++;
            }
        }

        System.out.println(answer - 1);
    }
}