import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		while (true) {
			if (N == 0 || N == 1) {
				break;
			}
			for (int i = 2; i <= N; i++) {
				if (N % i == 0) {
					System.out.println(i);
					N /= i;
					break;
				}
			}
		}
		sc.close();
	}

}
