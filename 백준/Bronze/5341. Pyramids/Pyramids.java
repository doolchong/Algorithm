import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, sum = 0;

		while (true) {
			sum = 0;
			n = sc.nextInt();

			if (n == 0) {
				break;
			} else {
				for (int i = n; i > 0; i--) {
					sum += i;
				}
			}
			System.out.println(sum);
			;
		}
		sc.close();
	}

}
