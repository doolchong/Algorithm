//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger N = sc.nextBigInteger();
        BigInteger M = sc.nextBigInteger();
        BigInteger d = new BigInteger("2");
        BigInteger c, n;

        N = N.subtract(M);
        n = N.divide(d);
        c = N.add(M);
        c = c.subtract(n);

        System.out.println(c);
        System.out.println(n);

        sc.close();
    }
}