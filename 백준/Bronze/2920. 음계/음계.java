import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int check1 = 0;
        int check2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < 8; i++) {
            int n = scanner.nextInt();
            if (i == 0) {
                check1 = n;
                check2 = n;
            }
            if (n == check1) {
                cnt1++;
            }
            if (n == check2) {
                cnt2++;
            }
            check1++;
            check2--;
        }

        if (cnt1 == 8) {
            System.out.println("ascending");
        } else if (cnt2 == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
