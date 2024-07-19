import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        long amount = 0;

        if (B > C || B == C) {
            amount = -1;
        } else {
            amount = A / (C - B) + 1;
        }

        System.out.println(amount);
    }
}
