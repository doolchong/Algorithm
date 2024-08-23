import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[1000001];

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i * i < 1000001; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j < 1000001; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 2; j <= n / 2; j++) {
                if (!isPrime[j]) {
                    if (!isPrime[n - j]) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}