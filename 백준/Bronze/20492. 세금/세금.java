import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a1 = N - N / 100 * 22;
        int a2 = N - N / 100 * 20 / 100 * 22;

        System.out.println(a1 + " " + a2);
    }
}
