import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static int cnt;

    public void dfs(int qCnt, int n) {
        Main main = new Main();
        if (qCnt == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[qCnt] = i;

            if (main.checkQ(qCnt)) {
                dfs(qCnt + 1, n);
            }
        }
    }

    public boolean checkQ(int column) {
        for (int i = 0; i < column; i++) {
            if (arr[column] == arr[i]) {
                return false;
            } else if (Math.abs(column - i) == Math.abs(arr[column] - arr[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];

        main.dfs(0, n);

        System.out.print(cnt);
    }
}