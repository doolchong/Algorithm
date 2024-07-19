import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int lcm = 0;

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int n = A * B;
            if (A > B) {
                while (true) {
                    int temp = A % B;
                    if (temp == 0) {
                        break;
                    }
                    A = B;
                    B = temp;
                }
                lcm = n / B;
                System.out.println(lcm);
            }else{
                while (true) {
                    int temp = B % A;
                    if (temp == 0) {
                        break;
                    }
                    B = A;
                    A = temp;
                }
                lcm = n / A;
                System.out.println(lcm);
            }
        }
    }
}
