import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;

        if (a + b + c - max(max(a, b), c) <= max(max(a, b), c)) {
            for (int i = max(max(a, b), c); i >= 0; i--) {
                if (a + b + c - max(max(a, b), c) > i) {
                    max = a + b + c - max(max(a, b), c) + i;
                    break;
                }
            }
        } else {
            max = a + b + c;
        }

        System.out.println(max);
    }
}
