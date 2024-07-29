import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new LinkedHashMap<>();

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }

        for (String s : str) {
            map.put(s, 1);
        }

        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}