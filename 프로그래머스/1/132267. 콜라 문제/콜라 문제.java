class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int full = 0;

        while (n >= a) {
            answer += (n / a) * b;
            full = (n / a) * b;
            n %= a;
            n += full;
        }

        return answer;
    }
}