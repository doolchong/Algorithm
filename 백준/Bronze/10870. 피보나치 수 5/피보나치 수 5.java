import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0, b = 1;
        if (n == 0) {
            int m = 0;
            System.out.println(m);
        } else if (n == 1) {
            int m = b;
            System.out.println(m);
        } else {
            int m = a + b;

            for (int i = 0; i < n - 1; i++) {
                m = a + b;
                a = b;
                b = m;
            }

            System.out.println(m);
        }
    }
}
