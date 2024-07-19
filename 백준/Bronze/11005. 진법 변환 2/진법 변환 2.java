import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int B = sc.nextInt();
		StringBuffer sb = new StringBuffer();

		while (true) {
			if (N == 0) {
				break;
			}
			if (N % B >= 10) {
				sb.append(Character.toString(N % B + 55));
			} else {
				sb.append(Integer.toString(N % B));
			}
			N /= B;
		}

		System.out.println(sb.reverse().toString());

		sc.close();
	}

}
