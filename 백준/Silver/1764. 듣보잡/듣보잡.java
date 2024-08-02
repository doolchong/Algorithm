import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            set.add(str);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            arrayList.add(str);
        }

        Collections.sort(arrayList);

        for (int i = 0; i < m; i++) {
            if (set.contains(arrayList.get(i))) {
                cnt++;
                sb.append(arrayList.get(i) + "\n");
            }
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}