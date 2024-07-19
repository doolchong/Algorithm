import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String al[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String S = sc.next();

		for (int i = 0; i < al.length; i++) {
			S = S.replaceAll(al[i], "!");
		}
		System.out.println(S.length());

		sc.close();
	}

}
