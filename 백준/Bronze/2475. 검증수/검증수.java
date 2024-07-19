import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, sum = 0;

		for (int i = 0; i < 5; i++) {
			N = sc.nextInt();
			sum += (N * N);
		}

		System.out.println(sum % 10);

		sc.close();
	}

}
