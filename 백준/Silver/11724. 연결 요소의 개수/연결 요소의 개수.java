import java.util.*;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] list;

    public void dfs(int v) {
        Main main = new Main();

        if (visited[v]) {
            return;
        }

        visited[v] = true;

        for (int i : list[v]) {
            if (!visited[i]) {
                main.dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        visited = new boolean[n + 1];
        list = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();

            list[s].add(e);
            list[e].add(s);
        }

        int cnt = 0;

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                cnt++;
                main.dfs(i);
            }
        }

        System.out.print(cnt);
    }
}