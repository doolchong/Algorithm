import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            int cnt = 0;
            int[] score = new int[n];
            for (int j = 0; j < n; j++) {
                score[j] = scanner.nextInt();
                sum += score[j];
            }
            double avg = (double)sum / n;

            for (int j = 0; j < n; j++) {
                if (score[j] > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (double) cnt / n * 100);
        }
    }
}
