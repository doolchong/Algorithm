import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A, B, C;
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		if (A == B && B == C && A == C) {
			System.out.println(10000 + (A * 1000));
		} else if (A == B) {
			System.out.println(1000 + (A * 100));
		} else if (B == C) {
			System.out.println(1000 + (B * 100));
		} else if (C == A) {
			System.out.println(1000 + (C * 100));
		} else {
			if (A > B && A > C) {
				System.out.println(A * 100);
			} else if (B > A && B > C) {
				System.out.println(B * 100);
			} else if (C > A && C > B) {
				System.out.println(C * 100);
			}
		}
		
		scanner.close();
	}

}
