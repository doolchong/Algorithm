import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String S = scanner.next();
            int cnt = 0;

            if (S.equals("0")) {
                break;
            }

            for (int i = 0; i < S.length() / 2; i++) {
                if (S.charAt(i) == S.charAt(S.length() - 1 - i)) {
                    cnt++;
                }
            }
            if (cnt == S.length() / 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
