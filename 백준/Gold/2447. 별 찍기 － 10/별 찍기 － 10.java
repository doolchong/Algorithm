import java.util.*;
import java.io.*;

public class Main {

    static char[][] charArray;

    public void recursive(int n, int x, int y, boolean isBlank) {
        if (isBlank) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    charArray[i][j] = ' ';
                }
            }
            return;
        }

        if (n <= 1) {
            charArray[x][y] = '*';
            return;
        }

        int squareSize = n / 3;
        int s = 0;

        for (int i = x; i < n + x; i += squareSize) {
            for (int j = y; j < n + y; j += squareSize) {
                s++;

                if (s == 5) {
                    recursive(squareSize, i, j, true);
                } else {
                    recursive(squareSize, i, j, false);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        charArray = new char[n][n];

        main.recursive(n, 0, 0, false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(charArray[i][j]);
            }
            sb.append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}