import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int cnt = 0;

		for (int i = 0; i < S.length() / 2; i++) {
			if (S.charAt(i) == S.charAt(S.length() - i - 1)) {
				cnt++;
			}
		}

		if (cnt == S.length() / 2) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}

		sc.close();
	}

}
