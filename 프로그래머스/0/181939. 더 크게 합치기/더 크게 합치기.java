class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String answer1 = "";
        String answer2 = "";

        answer1 += a;
        answer1 += b;
        answer2 += b;
        answer2 += a;

        if (Integer.parseInt(answer1) > Integer.parseInt(answer2)) {
            answer = Integer.parseInt(answer1);
        } else {
            answer = Integer.parseInt(answer2);
        }

        return answer;
    }
}