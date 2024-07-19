import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int X, N, a, b, total = 0;

		X = scanner.nextInt();
		N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			total += (a * b);
		}
		if (X == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();
	}

}
