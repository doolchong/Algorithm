import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                cnt++;
                continue;
            }
            int n1 = i / 100;
            int n2 = i % 100 / 10;
            int n3 = i % 10;

            if (n1 - n2 == n2 - n3) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
