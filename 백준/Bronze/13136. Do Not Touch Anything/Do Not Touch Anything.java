import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long R = scanner.nextInt();
        long C = scanner.nextInt();
        long N = scanner.nextInt();
        long n = 0;
        long m = 0;

        if (R % N != 0) {
            n = R / N + 1;
        } else {
            n = R / N;
        }
        if (C % N != 0) {
            m = C / N + 1;
        } else {
            m = C / N;
        }

        System.out.println(n * m);
    }
}
