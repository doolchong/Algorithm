import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, M, I, J, K;
		N = sc.nextInt();
		M = sc.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = 0;
		}

		for (int i = 0; i < M; i++) {
			I = sc.nextInt();
			J = sc.nextInt();
			K = sc.nextInt();
			for (int j = I - 1; j < J; j++) {
				arr[j] = K;
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}
