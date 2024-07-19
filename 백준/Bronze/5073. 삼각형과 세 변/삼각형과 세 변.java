import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = "";
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a > b && a > c) {
                if (a >= b + c) {
                    s += "Invalid";
                }
            } else if (b > a && b > c) {
                if (b >= a + c) {
                    s += "Invalid";
                }
            } else {
                if (c >= a + b) {
                    s += "Invalid";
                }
            }

            if (s.equals("")) {
                if (a == b && b == c) {
                    s += "Equilateral";
                } else if (a != b && b != c && c != a) {
                    s += "Scalene";
                } else {
                    s += "Isosceles";
                }
            }

            System.out.println(s);
        }
    }
}
