import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int cnt = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a' || S.charAt(i) == 'i' || S.charAt(i) == 'u' || S.charAt(i) == 'e' || S.charAt(i) == 'o') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    ;
}
