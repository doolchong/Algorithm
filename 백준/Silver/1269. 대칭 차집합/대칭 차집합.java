import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int cnt1 = 0;
        int cnt2 = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        for (Integer integer : setA) {
            if (setB.contains(integer)) {
                cnt1++;
            }
        }

        for (Integer integer : setB) {
            if (setA.contains(integer)) {
                cnt2++;
            }
        }

        System.out.println((setB.size() - cnt1) + (setA.size() - cnt2));
    }
}