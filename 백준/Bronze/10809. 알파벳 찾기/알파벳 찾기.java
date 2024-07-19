import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int cnt = 0, index = 0;

		for (int i = 97; i < 123; i++) {
			cnt = 0;
			for (int j = 0; j < S.length(); j++) {
				if ((int) S.charAt(j) == i) {
					if (cnt == 0) {
						index = j;
					}
					cnt++;
				}
			}
			if (cnt == 0) {
				System.out.print("-1 ");
			} else {
				System.out.print(index + " ");
			}
		}

		sc.close();
	}

}
