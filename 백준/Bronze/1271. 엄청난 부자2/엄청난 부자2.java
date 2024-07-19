import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();

		System.out.println(N.divide(M));
		System.out.println(N.mod(M));

		sc.close();
	}

}
