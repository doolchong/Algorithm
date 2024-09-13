import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();

        int n = scanner.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {
            String str = scanner.next();

            if (str.equals("ENTER")) {
                total += hashSet.size();
                hashSet.clear();
                continue;
            }
            hashSet.add(str);
        }

        total += hashSet.size();

        System.out.println(total);
    }
}