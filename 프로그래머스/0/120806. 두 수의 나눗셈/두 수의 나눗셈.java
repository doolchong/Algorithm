class Solution {
    public int solution(int num1, int num2) {
        double divide = (double) num1 / num2;
        int answer = (int) (divide * 1000);
        return answer;
    }
}