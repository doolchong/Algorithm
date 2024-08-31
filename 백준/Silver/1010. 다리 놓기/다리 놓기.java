import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            long result = 1;

            for (int j = 0; j < n; j++) {
                result *= (m - j);
                result /= (j + 1);
            }
            
            System.out.println(result);
        }
    }
}