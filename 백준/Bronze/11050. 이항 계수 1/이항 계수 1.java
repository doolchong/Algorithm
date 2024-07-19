import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int pac1 = 1;
        int pac2 = 1;
        int pac3 = 1;

        for (int i = 2; i <= n; i++) {
            pac1 *= i;
        }
        for (int i = 2; i <= k; i++) {
            pac2 *= i;
        }
        for (int i = 2; i <= n - k; i++) {
            pac3 *= i;
        }

        System.out.println(pac1 / (pac2 * pac3));
    }
}
