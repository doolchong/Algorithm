import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = 0;

        for (int m = N; m > 0; m--) {
            int sum = m;
            int cM = m;
            int i = 0, j = 0, k = 0;

            while (true) {
                sum += (cM % 10);
                cM /= 10;
                if (cM == 0) {
                    break;
                }
            }
            if (sum == N) {
                M = m;
            }
        }

        System.out.println(M);
    }
}
