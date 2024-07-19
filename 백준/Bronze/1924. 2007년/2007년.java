import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String[] str = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int day = y;

        for (int i = 1; i <= x; i++) {
            if (i == x) {
                continue;
            } else if (i == 2) {
                day += 28;
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                day += 31;
            } else {
                day += 30;
            }
        }

        System.out.println(str[day % 7]);
    }
}
