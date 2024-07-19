import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double arr[] = new double[N];
		double M = 0;
		double sum=0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > M) {
				M = arr[i];
			}
		}

		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] / M * 100;
			sum += arr[i];
		}

		System.out.println(sum / N);

		sc.close();
	}

}
