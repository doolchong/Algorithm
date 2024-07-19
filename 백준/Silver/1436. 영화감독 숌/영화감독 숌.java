import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 0;
        int ch = 0;
        int p = 1000;

        for (int i = 1; ; i++) {
            for (int j = 1; j <= i; j *= 10) {
                if ((i / j) % p == 666) {
                    cnt++;
                    if (cnt == n) {
                        System.out.println(i);
                        ch = 1;
                        break;
                    }
                    break;
                }
            }
            if (ch == 1) {
                break;
            }
        }
    }
}
