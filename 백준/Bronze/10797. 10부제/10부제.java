import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (day == num) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
