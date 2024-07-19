import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 1;

        for (int i = 0; i < N; i++) {
            result *= 2;
        }

        System.out.println(result);
    }
}
