import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, sum = 0;

		while (true) {
			sum = 0;
			n = sc.nextInt();
			if (n == -1) {
				break;
			}
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			if (sum == n) {
				System.out.print(n + " = ");
				for (int i = 1; i < n; i++) {
					if (i == 1) {
						System.out.print(i);
					} else if (n % i == 0) {
						System.out.print(" + " + i);
					}
				}
				System.out.println();
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		sc.close();
	}

}
