import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        char[][] chessW = new char[8][8];
        char[][] chessB = new char[8][8];

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        chessW[i][j] = 'W';
                    } else {
                        chessW[i][j] = 'B';
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        chessW[i][j] = 'B';
                    } else {
                        chessW[i][j] = 'W';
                    }
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        chessB[i][j] = 'B';
                    } else {
                        chessB[i][j] = 'W';
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        chessB[i][j] = 'W';
                    } else {
                        chessB[i][j] = 'B';
                    }
                }
            }
        }

        char[][] chess = new char[N][M];
        int min = 64;

        for(int i =0;i<N;i++){
            String S = scanner.next();
            for(int j=0;j<M;j++){
                chess[i][j]=S.charAt(j);
            }
        }

        for (int n = 0; n <= N - 8; n++) {
            for (int m = 0; m <= M - 8; m++) {
                int cnt = 0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (chessW[i][j] != chess[i + n][j + m]) {
                            cnt++;
                        }
                    }
                }
                if (cnt < min) {
                    min = cnt;
                }
            }
        }

        for (int n = 0; n <= N - 8; n++) {
            for (int m = 0; m <= M - 8; m++) {
                int cnt = 0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (chessB[i][j] != chess[i + n][j + m]) {
                            cnt++;
                        }
                    }
                }
                if (cnt < min) {
                    min = cnt;
                }
            }
        }

        System.out.println(min);
    }
}
