import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[3][2];
        int x = 0, y = 0;

        for (int i = 0; i < 3; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            int cnt1 = 0;
            int cnt2 = 0;

            for (int j = 0; j < 3; j++) {
                if (arr[i][0] == arr[j][0]) {
                    cnt1++;
                }
                if (arr[i][1] == arr[j][1]) {
                    cnt2++;
                }
            }
            if (cnt1 == 1) {
                x = arr[i][0];
            }
            if (cnt2 == 1) {
                y = arr[i][1];
            }
        }

        System.out.println(x + " " + y);
    }
}
