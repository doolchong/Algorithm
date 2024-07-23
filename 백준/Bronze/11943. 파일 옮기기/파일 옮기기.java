import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int min = 0;

        if (A + D >= B + C) {
            min = B + C;
        } else {
            min = A + D;
        }

        System.out.println(min);
    }
}
