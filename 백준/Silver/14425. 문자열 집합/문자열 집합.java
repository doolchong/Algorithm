import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int cnt = 0;

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            set.add(scanner.next());
        }

        for (int i = 0; i < M; i++) {
            if (set.contains(scanner.next())) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
