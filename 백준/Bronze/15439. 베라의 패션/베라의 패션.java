import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();

        System.out.println(n * (n - 1));
    }
}