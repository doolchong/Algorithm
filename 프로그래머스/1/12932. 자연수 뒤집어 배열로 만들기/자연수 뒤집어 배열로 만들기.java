class Solution {
    public int[] solution(long n) {
        long m = n;
        int length = 0;

        while (m > 0) {
            m /= 10;
            length++;
        }

        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}