import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine().trim();
		int cnt = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ' ') {
				cnt++;
			}
		}

		if (S.length() == 0) {
			System.out.println(cnt);
		} else {
			System.out.println(cnt + 1);
		}

		sc.close();
	}

}
