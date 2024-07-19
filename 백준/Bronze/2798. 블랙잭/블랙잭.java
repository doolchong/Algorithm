import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int max = 0;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < N; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (arr[i] + arr[j] + arr[k] <= M && arr[i] + arr[j] + arr[k] > max) {
                        max = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }

        System.out.println(max);
    }
}
