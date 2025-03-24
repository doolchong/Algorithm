import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int maxCnt = 0;
        int maxCntNum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > maxCnt) {
                maxCnt = map.get(arr[i]);
            }
        }

        int cnt = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == maxCnt) {
                if (cnt == 0) {
                    maxCntNum = arr[i];
                    cnt++;
                } else if (cnt == 1 && maxCntNum != arr[i]) {
                    maxCntNum = arr[i];
                    break;
                }
            }
        }

        System.out.println(Math.round((double) sum / n));
        System.out.println(arr[n / 2]);
        System.out.println(maxCntNum);
        System.out.println(max - min);
    }
}