import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int start = 1;
        int end = N;
        int sum = 0;
        int count = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        while (start < end) {
            sum = arr[start - 1] + arr[end - 1];
            if (sum < M) {
                start++;
            } else if (sum > M) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }

        System.out.println(count);
    }
}