import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long lcm = a * b;

        while (a % b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        long gcd = b;

        lcm /= gcd;

        System.out.println(lcm);
    }
}