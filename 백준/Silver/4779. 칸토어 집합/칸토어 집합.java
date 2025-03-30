import java.util.*;
import java.io.*;

public class Main {

    static char[] arr;

    public void kan(int s, int l) {
        if (l <= 1) {
            return;
        }

        int newL = l / 3;

        for (int i = s + newL; i < s + newL * 2; i++) {
            arr[i] = ' ';
        }

        kan(s, newL);
        kan(s + newL * 2, newL);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            sb = new StringBuilder();
            int n = Integer.parseInt(str);

            int l = (int) Math.pow(3, n);
            arr = new char[l];
            Arrays.fill(arr, '-');

            main.kan(0, l);

            for (int i = 0; i < l; i++) {
                sb.append(arr[i]);
            }

            System.out.println(sb);
        }
    }
}