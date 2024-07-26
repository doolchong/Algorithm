import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            if (s2.equals("enter")) {
                set.add(s1);
            } else if (s2.equals("leave")) {
                set.remove(s1);
            }
        }

        String[] str = new String[set.size()];

        int i = 0;
        for (String s : set) {
            str[i] = s;
            i++;
        }

        Arrays.sort(str);

        for (int j = str.length - 1; j >= 0; j--) {
            System.out.println(str[j]);
        }
    }
}
