import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[m + 1];

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= m; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= m; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= m; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = n; i <= m; i++) {
            if (isPrime[i]) {
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }
}