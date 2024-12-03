import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int start = 0;
        int end = 1;
        int count = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = arr[0];

        while (true) {
            if (sum < M) {
                if (end < N) {
                    sum += arr[end];
                    end++;
                } else {
                    break;
                }
            } else if (sum > M) {
                sum -= arr[start];
                start++;
            } else {
                count++;
                sum -= arr[start];
                start++;
            }
        }

        System.out.println(count);
    }
}