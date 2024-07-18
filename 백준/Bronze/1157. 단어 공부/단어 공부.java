import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int max = 0, ch = 0;
		int arr[] = new int[26];

		for (int i = 0; i < S.length(); i++) {
			if ((int) S.charAt(i) >= 65 && (int) S.charAt(i) <= 90) {
				arr[(int) S.charAt(i) - 65]++;
			} else if ((int) S.charAt(i) >= 97 && (int) S.charAt(i) <= 122) {
				arr[(int) S.charAt(i) - 97]++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			}
			else if (arr[i] == max && arr[i] != 0) {
				ch = -1;
			}
		}

		if (ch == -1) {
			System.out.print("?");
		} else {
			System.out.print((char) (ch + 65));
		}

		sc.close();
	}

}
