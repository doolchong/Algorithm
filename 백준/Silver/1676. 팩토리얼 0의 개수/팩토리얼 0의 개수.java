import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        BigInteger pac = new BigInteger("1");
        int cnt = 0;
        String s = "";

        for (int i = 1; i <= N; i++) {
            pac = pac.multiply(BigInteger.valueOf(i));
        }
        s += pac;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                cnt++;
            } else {
                break;
            }
        }

        System.out.println(cnt);
    }
}
