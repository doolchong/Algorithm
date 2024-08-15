class Solution {
    public long solution(int n) {
        long answer = 0;

        long a = 1L;
        long b = 1L;

        for (int i = 1; i < n; i++) {
            answer = (a + b) % 1234567;
            a = b;
            b = answer;
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        

        return answer;

    }
}