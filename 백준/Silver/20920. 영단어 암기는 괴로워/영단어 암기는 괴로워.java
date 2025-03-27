import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();

        String[] strs = br.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.length() >= m) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet);

        keySet.sort((o1, o2) -> o2.length() - o1.length());

        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (String s : keySet) {
            sb.append(s + "\n");
        }

        System.out.print(sb);
    }
}