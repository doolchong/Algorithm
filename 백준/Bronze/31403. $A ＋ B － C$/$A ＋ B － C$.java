import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        String D = "";
        D += A;
        D += B;

        int E = Integer.parseInt(D);

        System.out.println(A + B - C);
        System.out.println(E - C);
    }
}
