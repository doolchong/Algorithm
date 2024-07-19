import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        A += (D / 3600);
        D %= 3600;
        B += (D / 60);
        D %= 60;
        C += D;
        while (C >= 60) {
            B++;
            C -= 60;
        }
        while (B >= 60) {
            A++;
            B -= 60;
        }
        A %= 24;

        System.out.println(A + " " + B + " " + C);
    }
}
