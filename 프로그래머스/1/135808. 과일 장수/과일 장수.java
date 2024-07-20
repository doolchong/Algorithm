import java.util.Arrays;

class Solution {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        if (score.length % m == 0) {
            for (int i = score.length - 1; i >= 0; i -= m) {
                int min = score[i];
                for (int j = i; j > i - m; j--) {
                    if (score[j] < min) {
                        min = score[j];
                    }
                }
                answer += (min * m);
            }
        } else {
            for (int i = score.length - 1; i >= 0; i -= m) {
                int min = score[i];
                if (i - m < 0) {
                    break;
                }
                for (int j = i; j > i - m; j--) {
                    if (score[j] < min) {
                        min = score[j];
                    }
                }
                answer += (min * m);
            }
        }


        return answer;
    }
}