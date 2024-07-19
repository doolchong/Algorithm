public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                int sum = 0;
                int k = j;
                sum += k;
                while (k > 0) {
                    sum += k % 10;
                    k /= 10;
                }
                if (sum == i) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                System.out.println(i);
            }
        }
    }
}
