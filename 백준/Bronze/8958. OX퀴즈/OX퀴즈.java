import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int sum = 0;
            String S = scanner.next();

            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else if (S.charAt(j) == 'X') {
                    cnt = 0;
                }
            }
            
            System.out.println(sum);
        }
    }
}
