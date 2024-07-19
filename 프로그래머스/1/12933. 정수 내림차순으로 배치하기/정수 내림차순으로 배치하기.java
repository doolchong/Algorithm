class Solution {
    public long solution(long n) {
        long answer = 0;

        int[] num = new int[10];
        int cnt = 0;

        while (n > 0) {
            num[cnt] = (int) (n % 10);
            cnt++;
            n /= 10;
        }

        for (int i = 0; i < cnt; i++) {
            int temp = 0;
            for (int j = 0; j < cnt - 1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < cnt; i++) {
            answer *= 10;
            answer += num[i];
        }

        return answer;
    }
}