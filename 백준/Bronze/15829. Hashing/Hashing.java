import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        String S = scanner.next();
        char[] word = new char[l];
        long sum = 0;
        long pac = 1;

        for (int i = 0; i < l; i++) {
            word[i] = S.charAt(i);
        }

        for (int i = 0; i < l; i++) {
            long temp = (word[i] - 'a' + 1) * (pac % 1234567891);
            sum += temp % 1234567891;
            pac = (pac * 31) % 1234567891;
        }

        System.out.println(sum % 1234567891);
    }
}
