import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 3; j < n; j++) {
                arr[j] = arr[j - 2] + arr[j - 3];
            }

            System.out.println(arr[n - 1]);
        }
    }
}