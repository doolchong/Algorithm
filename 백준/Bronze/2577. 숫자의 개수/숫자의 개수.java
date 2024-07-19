import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = A * B * C;

        int[] arr = new int[10];

        while (D > 0) {
            arr[D % 10]++;
            D /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
}
