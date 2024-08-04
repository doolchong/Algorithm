import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                String name = scanner.next();
                String type = scanner.next();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int answer = 1;
            for (int val : map.values())
                answer *= val + 1;
            System.out.println(answer - 1);
        }
    }
}