import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S;
		String str[];
		double sum = 0, cnt = 0;

		for (int i = 0; i < 20; i++) {
			S = sc.nextLine();

			str = S.split(" ");

			if (str[2].equals("A+")) {
				sum += (4.5 * Double.parseDouble(str[1]));
			} else if (str[2].equals("A0")) {
				sum += (4.0 * Double.parseDouble(str[1]));
			} else if (str[2].equals("B+")) {
				sum += (3.5 * Double.parseDouble(str[1]));
			} else if (str[2].equals("B0")) {
				sum += (3.0 * Double.parseDouble(str[1]));
			} else if (str[2].equals("C+")) {
				sum += (2.5 * Double.parseDouble(str[1]));
			} else if (str[2].equals("C0")) {
				sum += (2.0 * Double.parseDouble(str[1]));
			} else if (str[2].equals("D+")) {
				sum += (1.5 * Double.parseDouble(str[1]));
			} else if (str[2].equals("D0")) {
				sum += (1.0 * Double.parseDouble(str[1]));
			} else if (str[2].equals("P")) {
				continue;
			} else {
				sum += 0.0;
			}
			cnt += Double.parseDouble(str[1]);
		}

		System.out.println(sum / cnt);

		sc.close();
	}

}
