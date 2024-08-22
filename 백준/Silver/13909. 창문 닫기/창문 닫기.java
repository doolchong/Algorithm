import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i * i <= N; i++) {
            cnt++;
        }

        System.out.println(cnt);
    }
}