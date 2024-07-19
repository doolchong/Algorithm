import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int money = 0;

        if (K * N > M) {
            money = K * N - M;
        }

        System.out.println(money);
    }
}
