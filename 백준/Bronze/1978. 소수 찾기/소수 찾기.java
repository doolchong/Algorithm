import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M;
		int cnt1 = 0, cnt2 = 0;

		for (int i = 0; i < N; i++) {
			M = sc.nextInt();
			for (int j = 1; j <= M; j++) {
				if (M % j == 0) {
					cnt1++;
				}
			}
			if (cnt1 == 2) {
				cnt2++;
			}
			cnt1 = 0;
		}

		System.out.println(cnt2);

		sc.close();
	}

}
