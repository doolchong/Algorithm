class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (m >= n) {
            int gcd = 1;
            for (int i = 1; i <= m; i++) {
                if (n % i == 0 && m % i == 0) {
                    gcd = i;
                }
            }
            answer[0] = gcd;
        } else {
            int gcd = 1;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && m % i == 0) {
                    gcd = i;
                }
            }
            answer[0] = gcd;
        }

        int lcm = 1;
        int i = 1;
        while (true) {
            if (i % n == 0 && i % m == 0) {
                lcm = i;
                break;
            }
            i++;
        }

        answer[1] = lcm;

        return answer;
    }
}