import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] ch, arr;
    static int n, m;

    public void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        ch[i][j] = 1;

        while (!queue.isEmpty()) {
            int cur[] = queue.poll();
            
            for (int k = 0; k < 4; k++) {
                int x = cur[0] + dx[k];
                int y = cur[1] + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (arr[x][y] != 0 && ch[x][y] != 1) {
                        ch[x][y] = 1;
                        arr[x][y] = arr[cur[0]][cur[1]] + 1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        ch = new int[n][m];
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = scanner.next();

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }

        main.bfs(0, 0);

        System.out.print(arr[n - 1][m - 1]);
    }
}