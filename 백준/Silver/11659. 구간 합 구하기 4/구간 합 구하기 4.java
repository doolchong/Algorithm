import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] sum = new int[n + 1];
        sum[1] = arr[0];

        for (int i = 2; i <= n; i++) {
            sum[i] = arr[i - 1] + sum[i - 1];
        }

        for (int k = 0; k < m; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            System.out.println(sum[j] - sum[i - 1]);
        }
    }
}