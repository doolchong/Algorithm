import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int pac = 1;

        for (int i = 1; i <= N; i++) {
            pac *= i;
        }

        System.out.println(pac);

        sc.close();
    }
}