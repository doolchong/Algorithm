class Solution {
    public long solution(long n) {
        long answer = 0;
        long m = 0;

        for (long i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    m = i + 1;
                    break;
                }
            }
        }

        if (m == 0) {
            return -1;
        }

        answer = m * m;

        return answer;
    }
}