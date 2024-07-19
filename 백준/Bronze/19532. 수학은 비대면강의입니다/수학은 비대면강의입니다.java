import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                int cnt = 0;
                if (a * x + b * y == c) {
                    cnt++;
                }
                if (d * x + e * y == f) {
                    cnt++;
                }
                if (cnt == 2) {
                    System.out.println(x + " " + y);
                }
            }
        }
    }
}
