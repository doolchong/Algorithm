import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n + 2];
        int[] p = new int[n + 2];
        int[] dp = new int[n + 2];
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            String[] str = br.readLine().split(" ");

            t[i] = Integer.parseInt(str[0]);
            p[i] = Integer.parseInt(str[1]);
        }

        if (n == 1) {
            max = p[0];
        }

        for (int i = 1; i <= n + 1; i++) {
            max = Math.max(max, dp[i]);

            int nextDay = i + t[i];
            int revenue = p[i];

            if (nextDay <= n + 1) {
                dp[nextDay] = Math.max(dp[nextDay], max + revenue);
            }
        }

        System.out.print(max);
    }
}