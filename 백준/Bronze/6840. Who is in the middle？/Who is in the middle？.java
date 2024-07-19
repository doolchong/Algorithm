import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int temp = 0;
		int N[] = new int[3];

		for (int i = 0; i < 3; i++) {
			N[i] = sc.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (N[j] > N[j + 1]) {
					temp = N[j];
					N[j] = N[j + 1];
					N[j + 1] = temp;
				}
			}
		}

		System.out.println(N[1]);

		sc.close();
	}

}
