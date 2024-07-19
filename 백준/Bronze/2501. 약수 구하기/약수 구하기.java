import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0, ch = 0;

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				cnt++;
				if (cnt == K) {
					System.out.println(i);
					ch++;
				}
			}
		}
		
		if (ch == 0) {
			System.out.println(0);
		}
		
		sc.close();
	}

}
