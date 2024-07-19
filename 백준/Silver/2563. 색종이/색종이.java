import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cp[][] = new int[100][100];
		int cnt = 0, n1 = 0, n2 = 0;

		for (int i = 0; i < N; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			for (int j = n1; j < n1 + 10; j++) {
				for (int k = n2; k < n2 + 10; k++) {
					cp[j][k] = 1;
				}
			}
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (cp[i][j] == 1) {
					cnt++;
				}
			}
		}

		System.out.print(cnt);

		sc.close();
	}

}
