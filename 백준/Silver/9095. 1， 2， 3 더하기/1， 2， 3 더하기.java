import java.util.*;

public class Main {

    static int n, answer;
    static int[] arr = {1, 2, 3};

    public void dfs(int sum) {
        if (sum > n) {
            return;
        }

        if (sum == n) {
            answer++;
        } else {
            for (int i = 0; i < 3; i++) {
                dfs(sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            answer = 0;
            n = scanner.nextInt();
            main.dfs(0);

            System.out.println(answer);
        }

    }
}