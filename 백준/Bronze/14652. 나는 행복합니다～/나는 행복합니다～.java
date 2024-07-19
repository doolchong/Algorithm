import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt++;
                if (cnt == k + 1) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
            if (cnt == k + 1) {
                break;
            }
        }
    }
}
