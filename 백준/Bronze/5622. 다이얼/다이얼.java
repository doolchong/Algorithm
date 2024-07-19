import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sec = 0;
		String S = sc.next();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'A' || S.charAt(i) == 'B' || S.charAt(i) == 'C') {
				sec += 3;
			} else if (S.charAt(i) == 'D' || S.charAt(i) == 'E' || S.charAt(i) == 'F') {
				sec += 4;
			} else if (S.charAt(i) == 'G' || S.charAt(i) == 'H' || S.charAt(i) == 'I') {
				sec += 5;
			} else if (S.charAt(i) == 'J' || S.charAt(i) == 'K' || S.charAt(i) == 'L') {
				sec += 6;
			} else if (S.charAt(i) == 'M' || S.charAt(i) == 'N' || S.charAt(i) == 'O') {
				sec += 7;
			} else if (S.charAt(i) == 'P' || S.charAt(i) == 'Q' || S.charAt(i) == 'R' || S.charAt(i) == 'S') {
				sec += 8;
			} else if (S.charAt(i) == 'T' || S.charAt(i) == 'U' || S.charAt(i) == 'V') {
				sec += 9;
			} else if (S.charAt(i) == 'W' || S.charAt(i) == 'X' || S.charAt(i) == 'Y' || S.charAt(i) == 'Z') {
				sec += 10;
			}
		}
		System.out.print(sec);

		sc.close();
	}

}
