import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int k = 0;
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();
            int[][] arr = new int[W][H];
            
            for (int i = 0; i < W; i++) {
                for (int j = 0; j < H; j++) {
                    arr[i][j]++;
                    k++;
                    
                    if (k == N) {
                        String S = "";
                        S += (j + 1);
                        if (i + 1 <= 9) {
                            S += "0";
                        }
                        S += (i + 1);
                        System.out.println(S);
                        break;
                    }
                }
            }
        }
    }
}
