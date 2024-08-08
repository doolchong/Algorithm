import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sortedArr;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sortedArr = arr.clone();

        Arrays.sort(sortedArr);

        for (int i = 0; i < sortedArr.length; i++) {
            if (!map.containsKey(sortedArr[i])) {
                map.put(sortedArr[i], cnt++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}