import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 65 && S.charAt(i) <= 90) {
				System.out.print((char)(S.charAt(i) - 65 + 97));
			} else if (S.charAt(i) >= 97 && S.charAt(i) <= 122) {
				System.out.print((char)(S.charAt(i) - 97 + 65));
			}
		}
		sc.close();
	}

}
