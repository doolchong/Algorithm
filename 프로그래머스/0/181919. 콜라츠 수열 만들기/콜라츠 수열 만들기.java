import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1];
        answer[0] = n;

        while (n != 1) {
            int[] arr = Arrays.copyOf(answer, answer.length);

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            answer = new int[arr.length + 1];
            answer = Arrays.copyOf(arr, arr.length + 1);
            answer[arr.length] = n;

        }
        
        return answer;
    }
}