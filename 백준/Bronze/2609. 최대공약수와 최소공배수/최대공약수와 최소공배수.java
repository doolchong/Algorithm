import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int gcd = 0;

        if (n > m) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && m % i == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <= m; i++) {
                if (n % i == 0 && m % i == 0) {
                    gcd = i;
                }
            }
        }

        int lcm = 1;
        
        while (true) {
            if (lcm % n == 0 && lcm % m == 0) {
                break;
            }
            lcm++;
        }

        System.out.println(gcd + " " + lcm);
    }
}
