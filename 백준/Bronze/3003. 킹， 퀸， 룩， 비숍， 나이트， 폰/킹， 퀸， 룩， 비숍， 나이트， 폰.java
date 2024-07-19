import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b[] = { 1, 1, 2, 2, 2, 8 };
		int w[] = new int[6];

		for (int i = 0; i < 6; i++) {
			w[i] = sc.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(b[i] - w[i] + " ");
		}
		sc.close();
	}

}
