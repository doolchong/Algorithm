import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();

        while (N > 0) {
            arr.add((int) (N % 10));
            N /= 10;
        }

        int[] nums = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        Arrays.sort(nums);

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
    }
}
