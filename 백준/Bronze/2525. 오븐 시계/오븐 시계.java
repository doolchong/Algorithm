import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H, M, m1, m2;

		H = scanner.nextInt();
		m1 = scanner.nextInt();
		m2 = scanner.nextInt();

		M = m1 + m2;
		if (M >= 60) {
			H += M / 60;
			M %= 60;
			if (H >= 24) {
				H -= 24;
			}
		}
		System.out.println(H + " " + M);

		scanner.close();
	}

}
