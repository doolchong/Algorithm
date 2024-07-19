import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            if (n1 == 0 && n2 == 0 & n3 == 0) {
                break;
            }

            if (n3 > n1 && n3 > n2) {
                if (n3 * n3 == (n1 * n1) + (n2 * n2)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if (n2 > n1 && n2 > n3) {
                if (n2 * n2 == (n1 * n1) + (n3 * n3)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if (n1 > n2 && n1 > n3) {
                if (n1 * n1 == (n2 * n2) + (n3 * n3)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
