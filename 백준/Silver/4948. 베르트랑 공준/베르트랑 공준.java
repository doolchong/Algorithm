import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int cnt = 0;
            long n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            for (long i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}