import java.util.Arrays;

class Solution {
    public static int solution(int... numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        if (numbers[0] == numbers[3]) {
            answer = (1111 * numbers[0]);
        } else if (numbers[0] == numbers[2]) {
            answer = (10 * numbers[0] + numbers[3]) * (10 * numbers[0] + numbers[3]);
        } else if (numbers[1] == numbers[3]) {
            answer = (10 * numbers[3] + numbers[0]) * (10 * numbers[3] + numbers[0]);
        } else if (numbers[0] == numbers[1] && numbers[2] == numbers[3]) {
            answer = (numbers[2] + numbers[0]) * (numbers[2] - numbers[0]);
        } else if (numbers[0] == numbers[1]) {
            answer = numbers[2] * numbers[3];
        } else if (numbers[1] == numbers[2]) {
            answer = numbers[0] * numbers[3];
        } else if (numbers[2] == numbers[3]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer = numbers[0];
        }

        return answer;
    }
}