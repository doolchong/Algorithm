import java.util.*;
import java.io.*;

public class Main {

    static int cnt = 0;
    static int k;
    static int answer = -1;

    public void merge_sort(int[] arr, int p, int r) {
        if (cnt > k) {
            return;
        }
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public void merge(int[] A, int p, int q, int r) {
        int[] tmp = new int[r - p + 1];
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= q) {  // 왼쪽 배열 부분이 남은 경우
            tmp[t++] = A[i++];
        }

        while (j <= r) {  // 오른쪽 배열 부분이 남은 경우
            tmp[t++] = A[j++];
        }

        i = p;
        t = 0;
        while (i <= r) {  // 결과를 A[p..r]에 저장
            cnt++;
            if (cnt == k) {
                answer = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);
        int[] arr = new int[n];

        str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        main.merge_sort(arr, 0, n - 1);

        System.out.print(answer);
    }
}