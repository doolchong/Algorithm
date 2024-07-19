import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt1 = 0, cnt2 = 0;
		String S1 = sc.next(), S2 = sc.next();

		while (true) {
			if (S1.charAt(cnt1) == 'h') {
				break;
			} else {
				cnt1++;
			}
		}
		while (true) {
			if (S2.charAt(cnt2) == 'h') {
				break;
			} else {
				cnt2++;
			}
		}

		if (cnt1 >= cnt2) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}

		sc.close();
	}

}
