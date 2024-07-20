class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String answer1 = "";

        answer1 += a;
        answer1 += b;

        if (Integer.parseInt(answer1) < 2 * a * b) {
            answer = 2 * a * b;
        } else {
            answer = Integer.parseInt(answer1);
        }

        return answer;
    }
}