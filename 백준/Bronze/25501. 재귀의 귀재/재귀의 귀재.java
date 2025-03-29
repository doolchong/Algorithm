import java.util.*;
import java.io.*;

public class Main {

    static int cnt = 0;

    public int recursion(String str, int l, int r) {
        cnt++;
        if (l >= r) {
            return 1;
        } else if (str.charAt(l) != str.charAt(r)) {
            return 0;
        } else {
            return recursion(str, l + 1, r - 1);
        }
    }

    public int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            cnt = 0;
            String str = br.readLine();
            System.out.print(main.isPalindrome(str));
            System.out.println(" " + cnt);
        }
    }
}