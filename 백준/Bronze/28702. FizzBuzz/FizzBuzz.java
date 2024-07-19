import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            String S = scanner.next();
            if (S.equals("FizzBuzz")) {

            } else if (S.equals("Fizz")) {

            } else if (S.equals("Buzz")) {

            } else {
                arr[i] = Integer.parseInt(S);
            }
        }
        int i = 0;

        for (int j = 0; j < 3; j++) {
            if (arr[j] != 0) {
                i = j;
            }
        }

        int temp = (arr[i] + (3 - i));

        if (temp % 3 == 0 && temp % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (temp % 3 == 0) {
            System.out.println("Fizz");
        } else if (temp % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(temp);
        }
    }
}
