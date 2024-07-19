import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] arr = new int[N][2];


        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        int x1 = arr[0][0];
        int x2 = arr[0][0];
        int y1 = arr[0][1];
        int y2 = arr[0][1];

        for (int i = 0; i < N; i++) {
            if (x1 > arr[i][0]) {
                x1 = arr[i][0];
            }
            if (x2 < arr[i][0]) {
                x2 = arr[i][0];
            }
            if (y1 > arr[i][1]) {
                y1 = arr[i][1];
            }
            if (y2 < arr[i][1]) {
                y2 = arr[i][1];
            }
        }

        System.out.println((x2 - x1) * (y2 - y1));
    }
}
