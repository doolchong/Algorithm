import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 2, cnt = 1;
		int X = sc.nextInt();

		while (true) {
			if (cnt >= X) {
				break;
			}
			cnt += i;
			i += 1;
		}

		if (i % 2 == 1) {
			System.out.println((X - cnt + i - 1) + "/" + (cnt - X + 1));
		} else if (i % 2 == 0) {
			System.out.println((cnt - X + 1) + "/" + (X - cnt + i - 1));
		}

		sc.close();
	}

}
