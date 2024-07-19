import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            int[][] people = new int[k + 1][n];
            for (int j = 0; j < n; j++) {
                people[0][j] = j + 1;
            }
            for (int j = 1; j < k + 1; j++) {
                for (int l = 0; l < n; l++) {
                    int sum = 0;
                    for (int m = 0; m <= l; m++) {
                        sum += people[j - 1][m];
                    }
                    people[j][l] = sum;
                }
            }
            System.out.println(people[k][n - 1]);
        }
    }
}
