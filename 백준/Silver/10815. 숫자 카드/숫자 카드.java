import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; i++) {
            if (set.contains(scanner.nextInt())) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
