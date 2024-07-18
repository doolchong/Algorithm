import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        arr[0] = scanner.nextInt();
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < N; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(min * max);
    }
}
