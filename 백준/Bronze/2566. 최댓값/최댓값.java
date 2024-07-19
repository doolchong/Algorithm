import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[9][9];
		int max = 0, I = 0, J = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] > max) {
					max = arr[i][j];
					I = i;
					J = j;
				}
			}
		}

		System.out.println(max);
		System.out.println((I + 1) + " " + (J + 1));

		sc.close();
	}

}
