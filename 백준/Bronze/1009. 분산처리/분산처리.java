import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            long pac = 1;
            for (int j = 0; j < b; j++) {
                pac *= a;
                pac %= 100;
            }
            if (pac % 10 == 0) {
                System.out.println(10);
            } else {
                System.out.println(pac % 10);
            }
        }


    }
}