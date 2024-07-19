import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int B = sc.nextInt();
		int b = 1;
		int sum = 0;

		for (int i = S.length()-1; i >= 0; i--) {
			if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
				sum += (((int) S.charAt(i) - 58 + 10) * b);
			} else {
				sum += ((int) S.charAt(i) - 65 + 10) * b;
			}
			b *= B;
		}

		System.out.println(sum);

		sc.close();
	}

}
