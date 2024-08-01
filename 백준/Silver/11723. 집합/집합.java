import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set.add(x);
            } else if (str.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) {
                    set.remove(x);
                }
            } else if (str.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (str.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) {
                    set.remove(x);
                } else {
                    set.add(x);
                }
            } else if (str.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (str.equals("empty")) {
                set.clear();
            }
        }
        System.out.println(sb);
    }
}