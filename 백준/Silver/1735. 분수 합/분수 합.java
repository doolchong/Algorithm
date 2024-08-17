import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int A = a * d + b * c;
        int num1 = A;
        int B = b * d;
        int num2 = B;

        while (B % A != 0) {
            int temp = B % A;
            B = A;
            A = temp;
        }

        System.out.print(num1 / A + " " + num2 / A);
    }
}