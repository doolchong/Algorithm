import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n, m;

		while (true) {
			n = sc.nextLong();
			m = sc.nextLong();
			if (n == 0 && m == 0) {
				break;
			}
			if (n > m) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}
