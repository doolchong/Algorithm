import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = new String[7];
        s[0] = "Never gonna give you up";
        s[1] = "Never gonna let you down";
        s[2] = "Never gonna run around and desert you";
        s[3] = "Never gonna make you cry";
        s[4] = "Never gonna say goodbye";
        s[5] = "Never gonna tell a lie and hurt you";
        s[6] = "Never gonna stop";

        int N = scanner.nextInt();
        scanner.nextLine();
        String S;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            S = scanner.nextLine();
            for (int j = 0; j < 7; j++) {
                if (S.equals(s[j])) {
                    cnt++;
                }
            }
        }

        if (cnt == N) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
