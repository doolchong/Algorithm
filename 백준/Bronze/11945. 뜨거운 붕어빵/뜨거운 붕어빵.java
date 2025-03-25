import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n == 0 || m == 0) {
            return;
        }

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            for (int j = m - 1; j >= 0; j--) {
                sb.append(str.charAt(j));
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}