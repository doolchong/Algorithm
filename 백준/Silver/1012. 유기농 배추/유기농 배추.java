import java.util.*;

public class Main {

    static int n, m, answer;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int curX, curY;

    public void dfs(int x, int y) {

        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            curX = x + dx[i];
            curY = y + dy[i];

            if (curX < m && curX >= 0 && curY < n && curY >= 0) {
                if (visited[curY][curX] == false && arr[curY][curX] == 1) {
                    dfs(curX, curY);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            answer = 0;
            m = scanner.nextInt();
            n = scanner.nextInt();
            int k = scanner.nextInt();
            arr = new int[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                arr[y][x] = 1;
            }

            answer = 0;

            for (int j = 0; j < n; j++) {
                for (int p = 0; p < m; p++) {
                    if (arr[j][p] == 1 && visited[j][p] == false) {
                        answer++;
                        main.dfs(p, j);
                    }
                }
            }

            System.out.println(answer);
        }

    }
}