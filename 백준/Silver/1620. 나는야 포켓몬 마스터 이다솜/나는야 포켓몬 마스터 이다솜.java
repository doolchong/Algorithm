import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            hashMap1.put(i, s);
            hashMap2.put(s, i);
        }

        for (int i = 1; i <= M; i++) {
            String s = br.readLine();
            try {
                bw.write(hashMap1.get(Integer.parseInt(s)) + "\n");
            } catch (Exception e) {
                bw.write(hashMap2.get(s) + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
