import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 1;
        int N = scanner.nextInt();
        int sum = 1;
        int count = 1;

        while (end != N) {
            if (sum < N) {
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
                count++;
            }
        }

        System.out.println(count);
    }
}