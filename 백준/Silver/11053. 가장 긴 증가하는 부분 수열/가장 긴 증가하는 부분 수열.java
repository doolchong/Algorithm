import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        int[] dp = new int[1001];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        dp[0] = 1;

        if (n == 1) {
            answer = 1;
        } else {
            for (int i = 1; i < n; i++) {
                int max = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] > arr[j]) {
                        max = Math.max(max, dp[j]);
                    }
                }
                dp[i] = max + 1;
                answer = Math.max(answer, dp[i]);
            }
        }

        System.out.println(answer);
    }
}