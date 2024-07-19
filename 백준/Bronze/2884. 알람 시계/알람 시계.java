import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H, M;
		H = scanner.nextInt();
		M = scanner.nextInt();

		if (M - 45 < 0) {
			H--;
			M += 60;
			if (H < 0) {
				H = 23;
			}
		}
		System.out.println(H + " " + (M - 45));

		scanner.close();
	}

}
