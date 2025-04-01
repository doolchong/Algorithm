import java.util.*;
import java.io.*;

public class Main {

    static int answer = Integer.MAX_VALUE;
    static int[][] dp;
    static int[][] house;

    public int dfs(int curH, int color) {
        if (dp[curH][color] != 0) {
            return dp[curH][color];
        }

        int sum = house[curH][color];

        if (color == 0) {
            sum += Math.min(dfs(curH - 1, 1), dfs(curH - 1, 2));
        } else if (color == 1) {
            sum += Math.min(dfs(curH - 1, 0), dfs(curH - 1, 2));
        } else {
            sum += Math.min(dfs(curH - 1, 0), dfs(curH - 1, 1));
        }

        dp[curH][color] = sum;

        return sum;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        house = new int[n][3];
        dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            house[i][0] = Integer.parseInt(str[0]);
            house[i][1] = Integer.parseInt(str[1]);
            house[i][2] = Integer.parseInt(str[2]);
        }

        for (int i = 0; i < 3; i++) {
            dp[0][i] = house[0][i];
        }

        for (int i = 0; i < 3; i++) {
            answer = Math.min(answer, main.dfs(n - 1, i));
        }

        System.out.print(answer);
    }
}