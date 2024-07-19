import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int min = N;

        for (int i = 0; i <= N; i += 5) {
            int M = N;
            int cnt = 0;
            if(i!=0){
                cnt += i / 5;
            }
            for (int j = 0; j <= N; j += 3) {
                M = N - i;
                M -= j;
                if (M == 0) {
                    cnt += j / 3;
                    break;
                }
            }
            if (M != 0) {
                continue;
            }
            if (min > cnt) {
                min = cnt;
            }
        }

        if (min == N) {
            min = -1;
        }

        System.out.println(min);
    }
}
