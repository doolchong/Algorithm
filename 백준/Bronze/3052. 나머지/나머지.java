import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		int N, cnt = 0, ch = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = 42;
		}

		for (int i = 0; i < 10; i++) {
			N = sc.nextInt();
			cnt = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] == N % 42) {
					cnt++;
				}
			}
			if (cnt == 0) {
				arr[i] = N % 42;
				ch++;
			}
		}
		System.out.println(ch);

		sc.close();
	}

}
