import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, M, I, J, temp;
		N = sc.nextInt();
		M = sc.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			I = sc.nextInt();
			J = sc.nextInt();
			temp = arr[I - 1];
			arr[I - 1] = arr[J - 1];
			arr[J - 1] = temp;
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
