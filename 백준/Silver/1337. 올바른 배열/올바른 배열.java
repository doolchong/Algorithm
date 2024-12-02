import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 4;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int start = i;
            int end = N - 1;
            while (start < end) {
                if (arr[end] - arr[start] > 4) {
                    end--;
                } else {
                    int temp = 4 - (end - start);
                    result = min(result, temp);
                    break;
                }
            }
        }

        System.out.println(result);
    }
}