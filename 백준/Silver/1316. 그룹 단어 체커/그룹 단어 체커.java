import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 0, ch = 0;
		String S;

		for (int i = 0; i < N; i++) {
			ch = 0;
			int arr[] = new int[26];
			S = sc.next();
			for (int j = 0; j < S.length(); j++) {
				if (arr[(int) S.charAt(j) - 97] != 0) {
					if (j != 0 && S.charAt(j - 1) != S.charAt(j)) {
						ch++;
					}
				}
				arr[(int) S.charAt(j) - 97]++;
			}
			if (ch == 0) {
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
