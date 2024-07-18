import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1000;

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        if (w - x > x) {
            min = x;
        } else {
            min = w - x;
        }
        if (h - y > y) {
            if (min > y) {
                min = y;
            }
        } else {
            if (min > h - y) {
                min = h - y;
            }
        }

        System.out.println(min);
    }
}
