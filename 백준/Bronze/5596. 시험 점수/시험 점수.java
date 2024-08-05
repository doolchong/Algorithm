import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sum = new int[2];
        int max = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i] += scanner.nextInt();
            }
            if (max < sum[i]) {
                max = sum[i];
            }
        }

        System.out.println(max);
    }
}