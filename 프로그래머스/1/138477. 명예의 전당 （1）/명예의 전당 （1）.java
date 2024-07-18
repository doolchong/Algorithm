import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] fame = new int[k + 1];

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                fame[k - i] = score[i];
                Arrays.sort(fame);
                answer[i] = fame[k - i];
            } else {
                fame[0] = score[i];
                Arrays.sort(fame);
                answer[i] = fame[1];
                fame[0] = 0;
            }
        }
        return answer;
    }
}
//sssssssss