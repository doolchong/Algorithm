import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String S = sc.next();
			System.out.print(S.charAt(0));
			System.out.println(S.charAt(S.length() - 1));
		}

		sc.close();
	}

}
